# software-dev-course-oop-3

## Introduction

In this exercise, you will be completing a project that simulates a management system for a media collection.
The `Main` class providing a menu system for the user is already implemented, but the `LibraryItem` class and its
subclasses `Album`, `Movie`, and `Book` need to be created and implemented.

> [!NOTE]
> The current project will not build or run, and tests will not run properly until you have completed the exercise.

## Creating the Base Class `LibraryItem`

The first class that you will need to create is the `LibraryItem` class.  This class will be the base class for the
`Album`, `Movie`, and `Book` classes, and need to contain the following `protected` fields:

| Property | Type   | Description                            |
|----------|--------|----------------------------------------|
| title    | String | The title of the item                  |
| year     | int    | The year the item was released         |
| author   | String | The author of the item (if applicable) |

The `LibraryItem` class should also contain the following methods:

| Method        | Arguments                                         | Return Type  | Description                                            |
|---------------|---------------------------------------------------|--------------|--------------------------------------------------------|
| `LibraryItem` | `title` (String), `year` (int), `author` (String) | None         | Constructor that initializes the fields of the class   |
| `toString`    | None                                              | String       | Returns a string representation of the item            |
| `getTitle`    | None                                              | String       | Returns the title of the item (getter method)          |
| `getYear`     | None                                              | int          | Returns the year the item was released (getter method) |
| `getAuthor`   | None                                              | String       | Returns the author of the item (getter method)         |

For your `toString` method, return a string formatted as follows:

```
Item: <title> by <author> (<year>)
```

## Creating the `Album` Subclass

The `Album` class is a subclass of the `LibraryItem` class and should contain the following additiohnal `protected` fields:

| Property   | Type    | Description                             |
|------------|---------|-----------------------------------------|
| trackCount | int     | The number of tracks on the album       |

You should also include an accessor method for the `trackCount` field:

| Method          | Arguments    | Return Type | Description                                               |
|-----------------|--------------|-------------|-----------------------------------------------------------|
| `getTrackCount` | None         | int         | Returns the number of tracks on the album (getter method) |

You will also need to implement a constructor that accepts the same arguments as the `LibraryItem` constructor, as well as
an additional argument for the `trackCount` field.  Remember to call the superclass constructor to initialize the fields of the
`LibraryItem` class, using the `super` keyword.

Finally, you will need to override the `toString` method to return a string representation of the `Album` object.  The string

You should override the `toString` method to return a string representation of the `Album` object in the following format:

```
Album: <title> by <author> (<year>) - <trackCount> tracks
```

| Method          | Arguments                                                             | Return Type  | Description                                                |
|-----------------|-----------------------------------------------------------------------|--------------|------------------------------------------------------------|
| `Album`         | `title` (String), `year` (int), `author` (String), `trackCount` (int) | None         | Constructor that initializes the fields of the class       |
| `toString`      | None                                                                  | String       | Returns a string representation of the album               |


## Creawting the `Movie` Subclass

The `Movie` class is a subclass of the `LibraryItem` class and should contain the following additional `protected` fields:

| Property          | Type    | Description                             |
|-------------------|---------|-----------------------------------------|
| durationInMinutes | int     | The duration of the movie in minutes    |

You should also include an accessor method for the `durationInMinutes` field:

| Method                  | Arguments    | Return Type | Description                                                  |
|-------------------------|--------------|-------------|--------------------------------------------------------------|
| `getDurationInMinutes`  | None         | int         | Returns the duration of the movie in minutes (getter method) |

You will also need to implement a constructor that accepts the same arguments as the `LibraryItem` constructor, as well as
an additional argument for the `durationInMinutes` field.  Remember to call the superclass constructor to initialize the fields of the
`LibraryItem` class, using the `super` keyword.

Finally, you will need to override the `toString` method to return a string representation of the `Movie` object.  The string

You should override the `toString` method to return a string representation of the `Movie` object in the following format:

```
Movie: <title> by <author> (<year>) - <durationInMinutes> minutes
```

| Method          | Arguments                                                                    | Return Type  | Description                                                 |
|-----------------|------------------------------------------------------------------------------|--------------|-------------------------------------------------------------|
| `Movie`         | `title` (String), `year` (int), `author` (String), `durationInMinutes` (int) | None         | Constructor that initializes the fields of the class        |
| `toString`      | None                                                                         | String       | Returns a string representation of the movie                |

## Creating the `Book` Subclass

The `Book` class is a subclass of the `LibraryItem` class and should contain the following additional `protected` fields:

| Property   | Type    | Description                             |
|------------|---------|-----------------------------------------|
| pageCount  | int     | The number of pages in the book         |

You should also include an accessor method for the `pageCount` field:

| Method          | Arguments    | Return Type | Description                                                  |
|-----------------|--------------|-------------|--------------------------------------------------------------|
| `getPageCount`  | None         | int         | Returns the number of pages in the book (getter method)      |

You will also need to implement a constructor that accepts the same arguments as the `LibraryItem` constructor, as well as
an additional argument for the `pageCount` field.  Remember to call the superclass constructor to initialize the fields of the
`LibraryItem` class, using the `super` keyword.

Finally, you will need to override the `toString` method to return a string representation of the `Book` object.  The string

You should override the `toString` method to return a string representation of the `Book` object in the following format:

```java
"Book: <title> by <author> (<year>) - <pageCount> pages"
```

| Method          | Arguments                                                             | Return Type  | Description                                                |
|-----------------|-----------------------------------------------------------------------|--------------|------------------------------------------------------------|
| `Book`          | `title` (String), `year` (int), `author` (String), `pageCount` (int) | None         | Constructor that initializes the fields of the class       |
| `toString`      | None                                                                  | String       | Returns a string representation of the book                |

In the book class, we are going to add one more method specific to `Book`s only.  This method will be called
`readBook`, and will take no arguments and return nothing (`void`).  The method should simply print out the following
message to the console:

```
Reading <title> by <author>...
Done!
```

## Verifying your Solution

Once you have completed the exercises, the first check that you have properly implemented the classes is to simply
build the project.  If there are any errors, you will need to correct them before proceeding.

Once the project builds successfully, you should run the `Main` class and interact with the console UI in the bottom
terminal window.  You should be able to add items to the library, view the items that have been added, and read
the books in the library.

Finally, you should run the tests in the `tests` folder to verify that your solutions are correct.

