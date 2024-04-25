package com.gdx.game.profile;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProfileSubjectDiffblueTest {
    /**
     * Method under test: {@link ProfileSubject#addObserver(ProfileObserver)}
     */
    @Test
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ProfileSubject.observers

        // Arrange and Act
        (new ProfileSubject()).addObserver(mock(ProfileObserver.class));
    }

    /**
     * Method under test: {@link ProfileSubject#removeObserver(ProfileObserver)}
     */
    @Test
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ProfileSubject.observers

        // Arrange and Act
        (new ProfileSubject()).removeObserver(mock(ProfileObserver.class));
    }

    /**
     * Method under test: {@link ProfileSubject#removeAllObservers()}
     */
    @Test
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ProfileSubject.observers

        // Arrange and Act
        (new ProfileSubject()).removeAllObservers();
    }

    /**
     * Method under test: {@link ProfileSubject#removeAllObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllObservers2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: index can't be >= size: 1 >= 1
        //       at com.badlogic.gdx.utils.Array.get(Array.java:155)
        //       at com.badlogic.gdx.utils.Array.removeAll(Array.java:329)
        //       at com.gdx.game.profile.ProfileSubject.removeAllObservers(ProfileSubject.java:22)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProfileSubject profileSubject = new ProfileSubject();
        profileSubject.addObserver(mock(ProfileObserver.class));
        profileSubject.addObserver(mock(ProfileObserver.class));

        // Act
        profileSubject.removeAllObservers();
    }

    /**
     * Method under test:
     * {@link ProfileSubject#notify(ProfileManager, ProfileObserver.ProfileEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.isLocalStorageAvailable()" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.profile.ProfileManager.storeAllProfiles(ProfileManager.java:65)
        //       at com.gdx.game.profile.ProfileManager.<init>(ProfileManager.java:31)
        //       at com.gdx.game.profile.ProfileManager.getInstance(ProfileManager.java:36)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProfileSubject profileSubject = new ProfileSubject();

        // Act
        profileSubject.notify(ProfileManager.getInstance(), ProfileObserver.ProfileEvent.PROFILE_LOADED);
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link ProfileSubject}
     */
    @Test
    void testNewProfileSubject() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ProfileSubject.observers

        // Arrange and Act
        new ProfileSubject();
    }
}
