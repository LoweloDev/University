# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /opt/clion/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /opt/clion/bin/cmake/linux/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/rub2_uebung03_vorlesung03.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/rub2_uebung03_vorlesung03.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/rub2_uebung03_vorlesung03.dir/flags.make

CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.o: CMakeFiles/rub2_uebung03_vorlesung03.dir/flags.make
CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.o -c /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/main.c

CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/main.c > CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.i

CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/main.c -o CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.s

# Object files for target rub2_uebung03_vorlesung03
rub2_uebung03_vorlesung03_OBJECTS = \
"CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.o"

# External object files for target rub2_uebung03_vorlesung03
rub2_uebung03_vorlesung03_EXTERNAL_OBJECTS =

rub2_uebung03_vorlesung03: CMakeFiles/rub2_uebung03_vorlesung03.dir/main.c.o
rub2_uebung03_vorlesung03: CMakeFiles/rub2_uebung03_vorlesung03.dir/build.make
rub2_uebung03_vorlesung03: CMakeFiles/rub2_uebung03_vorlesung03.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable rub2_uebung03_vorlesung03"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/rub2_uebung03_vorlesung03.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/rub2_uebung03_vorlesung03.dir/build: rub2_uebung03_vorlesung03
.PHONY : CMakeFiles/rub2_uebung03_vorlesung03.dir/build

CMakeFiles/rub2_uebung03_vorlesung03.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/rub2_uebung03_vorlesung03.dir/cmake_clean.cmake
.PHONY : CMakeFiles/rub2_uebung03_vorlesung03.dir/clean

CMakeFiles/rub2_uebung03_vorlesung03.dir/depend:
	cd /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03 /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03 /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung03-vorlesung03/cmake-build-debug/CMakeFiles/rub2_uebung03_vorlesung03.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/rub2_uebung03_vorlesung03.dir/depend

