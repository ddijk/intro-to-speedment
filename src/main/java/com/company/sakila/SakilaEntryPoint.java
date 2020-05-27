package com.company.sakila;

import com.company.sakila.sakila.sakila.actor.ActorManager;

/**
 * The entry point for the {@link com.speedment.runtime.config.Project} named
 * sakila
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class SakilaEntryPoint {
    
    public static void main(String... args) {
        final SakilaApplication application = new SakilaApplicationBuilder()
            // Add bundles, auth information, etc.
                .withPassword("aragon")
            .build();
        
        // Application logic goes here
        final ActorManager actors = application.getOrThrow(ActorManager.class);
        actors.stream().forEach(actor -> System.out.printf(
                "ID: %d, First name: %s, Last name: %s%n",
                actor.getActorId(),
                actor.getFirstName(),
                actor.getLastName()
        ));
        
        application.stop();
    }
}