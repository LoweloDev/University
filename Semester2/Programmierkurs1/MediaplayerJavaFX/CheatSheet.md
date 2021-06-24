```java
if (o instanceof Bild) {
Bild bild = (Bild) o;
if (location.equals(bild.location) && title.equals(bild.title) && year == bild.year)
return true;
}
```

Can be:

```java
        if (o instanceof Bild bild) {
            return location.equals(bild.location) && title.equals(bild.title) && year == bild.year;
        }
```

