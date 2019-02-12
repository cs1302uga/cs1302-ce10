# cs1302-ce10 Hierarchy Refactoring

> By failing to prepare, you are preparing to fail. 
> **--Benjamin Franklin**

This class exercise explores how to incorporate inheritance and interfaces when refactoring code.
It also revists how to commit and view changes to a local Git repository.

## Prerequisite Knowledge

* Inheritance and interfaces in Java.
* UML Class Diagrams

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce10`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce10.git
   ```

1. **[ALL GROUP MEMBERS]**
   If you did not setup your Git username and email on Nike when working on `cs1302-ce07`,
   then please revist that exercise and follow the instructions presented there.

1. Change into the `cs1302-ce10` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

   For each Java file under the `src` subdirectory, fill out a table similar to the following:
   
   | File Name | Java Type? | FQN | Depends On | Line Count |
   |-----------|------------|-----|------------|------------|
   |-----------|------------|-----|------------|------------|
   |-----------|------------|-----|------------|------------|
   |-----------|------------|-----|------------|------------|

   The "Java Type" column should list the outermost type in the file (e.g., class, interface, enum, etc). 
   The "Depends On" column should list any Java types in the `cs1302.ce10` package that the file
   is dependent upon. To determine the "Line Count", you may use the `wc` command. 

1. In your notes, draw a complete, proper UML diagram for all of the code contained in the
   starter code. **You might need to devote an entire page to this. We recommend using a pencil.** 
   Specifically, each individual class diagram should contain:

   * Class name;
   * Variables;
   * Constructors and methods;
   * If needed, a solid generalization arrow (`extends`) to a parent class; and
   * If needed, a dashed generalization arrow (`implements`) to an interface.

   In a class diagram, do not list inherited members unless they are explicitly overriden.
   Where applicable, be sure to include visibility modifiers (e.g., `+`, `#`, `~`, `-`) and
   type / return type information. Also, remember that generalization arrows have a triangle
   arrow head, which differentiates them from dependency and aggregration associations.
   
**CHECKPOINT**

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Nike using `cs1302-ce10-doc` as the name for your symbolic link.
   What is the URL of your website?
   
1. **[TRICKY]** Code __refactoring__ is the process of restructuring existing computer code without changing 
   its external behavior. As you likely noticed in your UML diagram, there is a lot of redundancy
   among the classes in the starter code. Let's attempt to reduce that redundancy. In your notes, 
   draw a **new** UML diagram that reduces most of that redundancy. Here are some things you can
   do:
   
   * Introduce new (parent) classes for "is-a" relationships;
   * Introduce new interfaces for "can-do" relationships; and 
   * Push common variables and methods up the hierarchy when reasonable.
   
   This is a tricky activity! While methods and variables that are identical may be easy targets
   for refactoring, what about ones that are similar? They too can be refactored and pushed up
   the hierarchy and combined into a single thing if they have the same meaning. You should make
   every effort to utilize abstract methods and overrides effectively. If you have questions
   about your design, then feel free to ask!
   
1. For each class and interface in your group's UML diagram, provide a justification for why you
   made it that way. Your instructor or PLA will check your UML and point at random boxes, then
   ask you, "why?" When you respond, you should answer verbally and show them your response in your
   notes. 

**CHECKPOINT**

1. For each box in your UML diagram, including new class and interfaces, fill out a table similar to 
   the following:
   
   | File Name | Java Type? | FQN | Depends On |
   |-----------|------------|-----|------------|
   |-----------|------------|-----|------------|
   |-----------|------------|-----|------------|
   |-----------|------------|-----|------------|
   
1. Based on the "Depends On" column in the previous step, list the files in the in an order of
   increasing dependency, starting with those that are independent. 

1. Refactor the code in the `cs1302.ce10` package based on your approved UML diagram from the
   previous checkpoint. You should do this one `.java` file at a time, in the order you came
   up with in the previous step. For each file, you need to do the following:
   
   1. Edit or create the file based on your UML diagram.
   1. Attempt to compile. If you encounter any compililation errors:
      1. Write the error down in your notes;
      1. Fix the error in your code;
      1. Recompile; then
      1. Note the fix in your notes.
      1. Repeat as needed.
   1. Tell Git to track changes made to the file, then commit the changes to your local copy of the 
      repository. Be sure to include a good log message.

1. Regenerate the API documentation website for all of the code in the `cs1302` package.

1. Now, for each `.java` file under the `src` directory, fill out a table similar to 
   the following:

   | File Name | Line Count |
   |-----------|------------|
   |-----------|------------|
   |-----------|------------|
   |-----------|------------|

1. Use Git to view your commit log.

1. Besides reducing the number of lines, what are two advantages of refactoring using inheritance
   and interfaces that your group noticed while working on this exercise?
   
1. Given the choice, would you design with inheritance and interfaces in mind? **Why or why not?**

**CHECKPOINT**

1. On the Internet, a fierce battle rages on among the kittens of the proleteriat and plebians alike.
   Who will be victorious? You can help decide at http://www.kittenwar.com! Here are pictures of
   two kittens, DJ Plattypuss Platyhelminth and Mocha, engaging in an epic stand off:
   
   [![DJ Plattypuss Platyhelminth](http://www.kittenwar.com/c_images/2006/08/05/82574.1.jpg)](http://www.kittenwar.com/kittens/82574/)
   [![Mocha](http://www.kittenwar.com/c_images/2006/10/30/102553.2.jpg)](http://www.kittenwar.com/kittens/102553/)

**NOT A CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
