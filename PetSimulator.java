/*
 * Activity 3.1.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = new Pet[10];

    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    pets[0] = new Pet("BUHBLES",Pet.CAT);
    pets[1] = new Pet("SNOWBALL",Pet.CAT);
    pets[2] = new Pet("FLYER",Pet.DOG);
    pets[3] = new Pet("TREX",Pet.DOG);
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : pets) {
      if (pet != null) {
        System.out.println(pet);
      }
    }
    // first things first, feed your pets
    for (Pet pet : pets) {
      if (pet != null) {
        pet.feed();
      }
    }

    // next, make yourself the owner of all of your new pets
    for (Pet pet : pets) {
      if (pet != null) {
        pet.setOwner("Me");
      }
    }

    // your dogs make some noise, take them for a walk
    for (Pet pet : pets) {
      if (pet != null && pet.getType() == Pet.DOG) {
        pet.makeNoise();
        pet.walk();
      }
    }

    // when you get back, your cats make some noise
    for (Pet pet : pets) {
      if (pet != null && pet.getType() == Pet.CAT) {
        pet.makeNoise();
      }
    }

    // give all of your pets a treat
    for (Pet pet : pets) {
      if (pet != null) {
        pet.giveTreat();
      }
    }

    // groom your cats
    for (Pet pet : pets) {
      if (pet != null && pet.getType() == Pet.CAT) {
        pet.groom();
      }
    }
 
    // grooming is done, play with all pets
    for (Pet pet : pets) {
      if (pet != null) {
        pet.play();
      }
    }

    // whew, that was tiring, all pets nap and get fed

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : pets) {
      if (pet != null) {
        System.out.println(pet);
      }
    }

    // You decide to get a couple of pets for your friend (does not require looping)
    pets[4] = new Pet("Mittens",Pet.CAT);
    pets[5] = new Pet("Buddy",Pet.DOG);

    // set the owner of the new pets to your friends name
    pets[4].setOwner("Friend");
    pets[5].setOwner("Friend");

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : pets) {
      if (pet != null) {
        System.out.println(pet);
      }
    }

  }
}