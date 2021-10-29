HEADERS = ggt.h

default: calcggt

ggt.o: ggt.c $(HEADERS)
	gcc -c ggt.c

calcggt: ggt.o
	gcc -o calcggt calcggt.c ggt.o

clean:
	-rm -f ggt.o