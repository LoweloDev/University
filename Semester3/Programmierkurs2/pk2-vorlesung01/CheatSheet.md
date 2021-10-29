### C

- Procedural language
- imperative
- compiled
- static type checking
- weakly typed type converting without further approval possible
- no primitive datatype for Boolean or String (boolean 0 or 1 string = chararray)
- pointers
- slim lanugage extent (frequent usage of libraries)

#### Compiling
- preprocessor -> modified sourcecode
- compiler -> Assembler code
- assembler -> machine code (Object file, not executable)
- binder/linker -> objectfiles + libraries -> Executable programm

#### Compiles and links files into one executable
gcc filename -o mainmethod filedestination

#### Compiles but suppresses linking of the files into one executable
https://en.wikipedia.org/wiki/Linker_(computing)

gcc -c pathtofile

Headerfile to call method publicly. Here you define method like public interface, no method body.
filename.h

Then you can #include "headerfilename"
and call stuff from there.

#### Sourcecode
- startpoint -> main() method


### makefile

https://stackoverflow.com/questions/1484817/how-do-i-make-a-simple-makefile-for-gcc-on-linux

https://stackoverflow.com/questions/2756290/makefile-extension/13616661

https://stackoverflow.com/questions/48818329/creating-a-makefile-for-multiple-c-files

Dynamically:
https://www.cs.colostate.edu/~cs157/LectureMakefile.pdf

And look up other tutorials


