### Linked lists

Max 1. link / element (Node)

### Trees (e.g. JSON)

h = Höhe
d = Maximalgrad
n = Anzahl Knoten
t = Tiefe
l = level

n links / node | ![equation](http://www.sciweavers.org/tex2img.php?eq=n%20%5Cepsilon%20N&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

e.g. in JSON:
```json
{
  "squadName": "Super hero squad",
  "homeTown": "Metro City",
  "formed": 2016,
  "secretBase": "Super tower",
  "active": true,
  "members": [
    {
      "name": "Molecule Man",
      "age": 29,
      "secretIdentity": "Dan Jukes",
      "powers": [
        "Radiation resistance",
        "Turning tiny",
        "Radiation blast"
      ]
    }
  ]
}
```
Src: https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Objects/JSON

####Path
![equation](http://www.sciweavers.org/tex2img.php?eq=k_%7B0%7D%2C...%2Ck_%7Bm%7D%20nodes%3A%20k_%7Bi%2B1%7D%20%20%5Cvdash%20k_%7Bi%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Depth of tree: Pathlength to highest level
Depth of node: Pathlength to root
Nodes in depth x == nodes on level x

### Binary trees

Max. 2 links / node:

![equation](http://www.sciweavers.org/tex2img.php?eq=%20%5Cforall%20%5C%20node%5C%20%20%5Cepsilon%20%5C%20%20tree%3A%20node%20%5CRightarrow%20n%2AchildNode%20%5Cmid%20n%20%5Cepsilon%20N%20%5Cleq%202&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Formula for No. of nodes in completed (binary) tree:

![equation](http://www.sciweavers.org/tex2img.php?eq=n%20%3D%20%5Csum_%7Bt%3D0%7D%5E%7Bh-1%7D%20%20d%5E%7Bt%7D%20%20%5CLeftrightarrow%20n%3D%20%5Cfrac%7B%20d%5E%7Bh%7D-1%20%7D%7Bd-1%7D%20%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

### Search trees

#### Key

Unique 2-Tupel

Every key left from node is smaller value.
Every key right from node is higher value.

Removing a key with 2 childs:
rotating between replacing by biggest key of left
part-tree and replacing by smallest key of right partkey.
So that both left and right key are equally reduced, 
and tree doesnt degenerate (to a list, which is slower (O(n))).

### Traversing

preorder:
1. current node
2. recursive call left tree
3. recursive call right tree

inorder: 
1. recursive call left tree
2. current node
3. recursive call right tree

postorder:
1. recursive call left tree
2. recursive call right tree
3. current node

Typechecking problems:

Interface Comparable<T>

method to implement compareTo(T o)

only returns true if also equals(o) returns true
(hash is same)

### Aufgabe 1

a) 5

b) 4

c) Ja. Anzahl childNodes / Node <= 2

d) sofern die Zahlen Schlüssel darstellen: Ja.
Key linker Bäume rekrursiv kleiner als Node, rechts größer.

e) 

Search(210)

Preorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B1%7D%2C%20123%29%20%20%5Cdashv%20%28%20l_%7B2%7D%2C%2069%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2078%29%3B%20%20%5Cdashv%20%28%20l_%7B2%7D%2C%20225%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%20200%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%20210%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Inorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B4%7D%2C%2019%29%20%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29%20%5Cdashv%20%28%20l_%7B2%7D%2C%2069%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2078%29%20%5Cdashv%20%28%20l_%7B1%7D%2C%20123%29%20%5Cdashv%20%28%20l_%7B5%7D%2C%20201%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%20210%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Postorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2078%29%20%5Cdashv%20%28%20l_%7B2%7D%2C%2069%29%20%5Cdashv%20%28%20l_%7B5%7D%2C%20201%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%20210%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Search(50)

Preorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B1%7D%2C%20123%29%20%5Cdashv%20%28%20l_%7B2%7D%2C%2069%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Inorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29%20%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Postorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2050%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Search(123)

Preorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B1%7D%2C%20123%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Inorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29%20%5Cdashv%20%28%20l_%7B2%7D%2C%2069%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2078%29%20%5Cdashv%20%28%20l_%7B1%7D%2C%20123%29&bc=White&fc=Black&im=png&fs=12&ff=arev&edit=0)

Postorder: ![equation](http://www.sciweavers.org/tex2img.php?eq=%28%20l_%7B4%7D%2C%2019%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%2050%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2033%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%2078%29%20%5Cdashv%20%28%20l_%7B2%7D%2C%2069%29%20%5Cdashv%20%28%20l_%7B5%7D%2C%20201%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%20210%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%20200%29%20%5Cdashv%20%28%20l_%7B4%7D%2C%20444%29%20%5Cdashv%20%28%20l_%7B3%7D%2C%20364%29%20%5Cdashv%20%28%20l_%7B2%7D%2C%20225%29%20%5Cdashv%20%28%20l_%7B1%7D%2C%20123%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Search(371)

Entire tree will be searched and nothing will be found.

f) Insert: 70, 79, 199, 363

Remove: 201

### Aufgabe 3

Algorithmus:

1. String result = "" + einKnoten.getDaten()
2. if (einKnoten.getKnotenLinks() != null)
3. result += traversierePreOrder(einKnoten.getKnotenLinks());
4. if (einKnoten.getKnotenRechts() != null)
5. result += traversierePreOrder(einKnoten.getKnotenRechts()); 
6. return result;

#### Step by Step

---
**Initial call**

---

- E

1. String result = "" + einKnoten.getDaten() -> "E"
2. if (einKnoten.getKnotenLinks() != null) -> true
3. result += traversierePreOrder(einKnoten.getKnotenLinks()); -> traversierePreOrder(D)
-> "DA"
---
**2nd Part (See end of recursion)**

---
4. if (einKnoten.getKnotenRechts() != null)
5. result += traversierePreOrder(einKnoten.getKnotenRechts());
6. return result;


- D

1. String result = "" + einKnoten.getDaten() -> "D"
2. if (einKnoten.getKnotenLinks() != null) -> true
3. result += traversierePreOrder(einKnoten.getKnotenLinks()); -> traversierePreOrder(A) -> "A"

- A

1. String result = "" + einKnoten.getDaten() -> "A"
2. if (einKnoten.getKnotenLinks() != null) -> false
3. result += traversierePreOrder(einKnoten.getKnotenLinks());
4. if (einKnoten.getKnotenRechts() != null) -> false
5. result += traversierePreOrder(einKnoten.getKnotenRechts());
6. return result; -> "A"

---
**2nd Part of initial call**

---
4. if (einKnoten.getKnotenRechts() != null) -> true
5. result += traversierePreOrder(einKnoten.getKnotenRechts()); -> "SOPRQZ"


