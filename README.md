Build Instructions:

run `make`

When prompted, accept the default values with the exception of entering in a
password in place of SOMEPASSWORD as shown below...

```
Enter keystore password: SOMEPASSWORD  
Re-enter new password: SOMEPASSWORD
What is your first and last name?
  [Unknown]:  
What is the name of your organizational unit?
  [Unknown]:  
What is the name of your organization?
  [Unknown]:  
What is the name of your City or Locality?
  [Unknown]:  
What is the name of your State or Province?
  [Unknown]:  
What is the two-letter country code for this unit?
  [Unknown]:  
Is CN=Unknown, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown correct?
  [no]:  yes

Enter key password for <net>
    (RETURN if same as keystore password):  

Enter Passphrase for keystore: SOMEPASSWORD
```

To run it, copy the release folder to a webserver and then load the page in your browser.

You'll be asked to permit the applet to load (due to being self-signed), which you must
accept otherwise it won't load.

Then in a Javascript console, you can execute:

```js
net.nslookup("media.tumblr.com");
```

and you should get a result similar to:

```js
[23.62.63.48, 23.62.63.49, 23.62.63.50, 23.62.63.10, 23.62.63.16, 23.62.63.17, 23.62.63.27, 23.62.63.43, 23.62.63.19]
```
