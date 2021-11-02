import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick one of the following animals: Bird, Snake, Lizard, Turtle, Cat, Koala, Dinosaur, Dog, Bear (either black, brown, or polar), Monkey, Sabertooth Cat, or Extinct.\nPut either y or n (yes or no) to signify your answer to each question.");

        System.out.print("Is it a mammal? ");
        String result = scanner.nextLine();

        if (result.contains("y")) {
            System.out.print("Can you find it in a zoo? ");
            result = scanner.nextLine();

            if (result.contains("y")) {
                System.out.print("Does it hibernate? ");
                result = scanner.nextLine();

                if (result.contains("y")) {
                    System.out.print("Does it have fur? ");
                    result = scanner.nextLine();

                    if (result.contains("y")) {
                        System.out.print("Is the fur brown? ");
                        result = scanner.nextLine();

                        if (result.contains("y")) {
                            System.out.print("It's a brown bear.");

                        } else {
                            System.out.print("Is the fur white? ");
                            result = scanner.nextLine();

                            if (result.contains("y")) {
                                System.out.print("It's a polar bear.");

                            } else {
                                System.out.print("Is the fur black? ");
                                result = scanner.nextLine();

                                if (result.contains("y")) {
                                    System.out.print("It's a North American black bear.");

                                } else {
                                    System.out.print("Is the fur grey? ");
                                    result = scanner.nextLine();

                                    if (result.contains("y")) {
                                        System.out.print("It's a koala.");

                                    } else {
                                        System.out.print("I do not know, please restart");

                                    }

                                }

                            }

                        }

                    } else {
                        System.out.print("Is it extinct? ");
                        result = scanner.nextLine();

                        if (result.contains("y")) {
                            System.out.print("It's a dinosaur.");

                        } else {
                            System.out.print("I do not know, please restart.");
                        }
                    }

                } else {
                    System.out.print("It's a monkey.");
                }

            } else {
                System.out.print("Can you buy one? ");
                result = scanner.nextLine();

                if (result.contains("y")) {
                    System.out.print("Is it a pet? ");
                    result = scanner.nextLine();

                    if (result.contains("y")) {
                        System.out.print("Does it make sounds? ");
                        result = scanner.nextLine();

                        if (result.contains("y")) {
                            System.out.print("Does it bark? ");
                            result = scanner.nextLine();

                            if (result.contains("y")) {
                                System.out.print("It's a dog.");

                            } else {
                                System.out.print("Does it meow? ");
                                result = scanner.nextLine();

                                if (result.contains("y")) {
                                    System.out.print("It's a cat.");

                                } else {
                                    System.out.print("Does it chirp? ");
                                    result = scanner.nextLine();

                                    if (result.contains("y")) {
                                        System.out.print("It's a bird.");

                                    } else {
                                        System.out.print("Does it have a shell? ");
                                        result = scanner.nextLine();

                                        if (result.contains("y")) {
                                            System.out.print("It's a turtle.");

                                        } else {
                                            System.out.print("It's extinct.");

                                        }
                                    }
                                    System.out.print("It's extinct.");
                                }
                            }
                        } else {
                            System.out.print("It's extinct.");

                        }

                    } else {
                        System.out.print("It's extinct.");

                    }

                } else {
                    System.out.print("Is it extinct? ");
                    result = scanner.nextLine();

                    if (result.contains("y")) {
                        System.out.print("It's a sabertooth cat.");

                    } else {
                        System.out.print("I do not know, please restart.");

                    }

                }

            }

        } else {
            System.out.print("Is it a reptile? ");
            result = scanner.nextLine();

            if (result.contains("y")) {
                System.out.print("Does it have legs? ");
                result = scanner.nextLine();

                if (result.contains("y")) {
                    System.out.print("Does it live near water? ");
                    result = scanner.nextLine();

                    if (result.contains("y")) {
                        System.out.print("Is it big? ");
                        result = scanner.nextLine();

                        if (result.contains("y")) {
                            System.out.print("It's a crocodile.");

                        } else {
                            System.out.print("It's a turtle.");

                        }

                    } else {
                        System.out.print("It's a lizard.");

                    }

                } else {
                    System.out.print("It's a snake.");

                }

            } else {
                System.out.print("It's a bird.");

            }

        }

    }
}