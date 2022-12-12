
package com.ddlab.rnd.xml.digsig;

import java.io.File;

public class TestVerifyXmlDigitalSignature {

	public static void testSignedXMLDoc() {
		String signedXmlFilePath = "xml" + File.separator + "digitallysignedEmpSal.xml";
		String publicKeyFilePath = "keys" + File.separator + "publickey.key";
		try {
			boolean validFlag = XmlDigitalSignatureVerifier.isXmlDigitalSignatureValid(signedXmlFilePath,
					publicKeyFilePath);
			System.out.println("Validity of XML Digital Signature : " + validFlag);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Test for Valid one
		testSignedXMLDoc();

	}
}
