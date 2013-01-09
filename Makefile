release/net.jar: bin/net.jar keystore
	mkdir -p release
	cp src/index.html release/index.html
	jarsigner -keystore keystore -signedjar release/net.jar bin/net.jar net

bin/net.class: src/net.java
	mkdir -p bin
	javac -d bin src/net.java

bin/net.jar: bin/net.class
	cd bin && jar cfe net.jar net net.class

keystore:
	keytool -genkey -keystore keystore -alias net

clean:
	rm -rf bin/

dist-clean: clean
	rm -rf release/
	rm -f keystore

.PHONY: clean dist-clean
