### General
HTML: Struktur
CSS: Gestaltung
JS: Logik

### Tip
- Use Best Practices

### Get IP Address info
ifconfig | grep inet (Linux/Mac)
ipconfig (Windows)

### Get Ports Info
lsof -i (Linux/Mac)
netstat -tulpn (Linux only)

t(TCP)u(UDP)l(listening/open)p(processes)n(IPAddress instead of host name)

netstat -ano (Windows)
a(connections/listening ports)n(numeric view)o(connect process id to respective port)

### DNS Lookup
DNS = Domain Name Service
Like phonebook for websites, name instead of IP to connect

nslookup -q=QUERY (Windows,Linux,Mac)

Example: 
nslookup -q=any fh-dortmund.de

or

host [OPTIONS] [DOMAINNAME] (Linux)

### HTTP CALLS (usage e.g. for REST)

curl [OPTIONS] [URL] (Windows, Linux, Mac)

Example: curl -v https://fh-dortmund.de/de/index.php

Returns plain text HTML Page contents additional to other information.

Example REST call: https://api.github.com/repos/lowelodev/University/contents/

Calls method via URL as defined in backend of github via API Code and sends the return value of the method in JSON (Java script object notation) notation.

### DevTools in Browser (Depends on Browser)
CTRL + OPTION + I (Mac)
F12 (depends on browser)

Netzwerkanalyse Tab zeigt HTTP Calls

### TCP/IP Control hierarchy
Application
(Anwendung)
-- Application what we have looked at so far in this document ---

Transport
Internet
Link
(Netzzugang)

### Wireshark network analysis
Network layers example:
![image](https://ibb.co/6DVFtMD)

UDP = User Datagram Protocol
TCP = Transmission Control Protocol

#### 3-Way Handshake (default TCP connection)

Source calls Destination at Port (HTTP/HTTPS or whatever else)
Calls with SYN (for synchronization)

Destination answers with (SYN, ACK) (Synchronization acknowledged)

Source responds with (ACK) (Acknowledge)

TCP connection established.


Application layer communication now:

Hypertext Transfer Protocol:

Server answers with (ACK) via TCP
Server sends HTTP answer.
Client sends (ACK) when it got the answer.

