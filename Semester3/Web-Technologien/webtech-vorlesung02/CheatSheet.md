### Aufgabe 1

Techincally:
```html
<!DOCTYPE html>
<html>
    <head> <title> title</title> </head>
</html>
```

Optionally, a better basic structure is for example:

```html
<!DOCTYPE html>
<html>
    <head>
        <title> Sometitle shown at Browsertab</title>
    </head>
<body>
    <header>Navigation and shit</header>
    <section>
        <h1> Some Title </h1>
        <!-- Some more stuff -->
    </section>
    <!-- some more stuff -->
</body>
```

### Aufgabe 2

1. Nicht viel. Außer dass die \<li> tags vom Browser jeweils automatisch geschlossen werden. Ansonsten sieht es ziemlich gleich aus, abgesehen von dem standard-stylesheet ofc.

2. lang attribute hinzufügen, macht eigentlich nur sinn wenn man mehrere Sprachen nutzt. Oder ggf. für Übersetzer wie Google Translate die ganze Websiten übersetzen um herauszufinden welche Sprache eine Website ist ohne großartig Stringcomparison.

3. Element head fehlt; Teil der Grundstruktur eines HTML Dokuments in dem metadaten stehen sowie ggf. Stylesheets und scripte eingebunden werden können, sowie auch Fonts und eben der Website titel.

4. Li not allowed as child of element body in this context. Li elemente sollten in listen gepackt werden, weil es list items sind.

### Aufgabe 3

1. 
```html
<!DOCTYPE html>
<html  lang="de">
    <head>
        <title>Sometitle</title>
    </head>
    <body>
    <h1> header1</h1>
    <ul>
    <li> listitem </li>
    <li> listitem </li>
    <li> listitem </li>
    </ul>
    </body>
</html>
```

2. 
```html
<!-- minimum structure -->
<!DOCTYPE html>
<html  lang="de">
    <head>
        <title>Sometitle</title>
    </head>
</html>
```
