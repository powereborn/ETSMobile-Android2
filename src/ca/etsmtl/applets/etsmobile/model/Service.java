package ca.etsmtl.applets.etsmobile.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 2.0.3.1
//
// Created by Quasar Development at 03-03-2014
//
//---------------------------------------------------

import java.util.Hashtable;

import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import ca.etsmtl.applets.etsmobile.http.soap.ExtendedSoapSerializationEnvelope;

@DatabaseTable(tableName="service")
public class Service extends AttributeContainer implements KvmSerializable {

	@DatabaseField(id=true)
	public Integer ServiceCode = 0;

	@DatabaseField
	public String Nom;

	public Service() {
	}

	public Service(AttributeContainer inObj,
			ExtendedSoapSerializationEnvelope envelope) {

		if (inObj == null)
			return;

		SoapObject soapObject = (SoapObject) inObj;

		if (soapObject.hasProperty("ServiceCode")) {
			Object obj = soapObject.getProperty("ServiceCode");
			if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
				SoapPrimitive j = (SoapPrimitive) obj;
				if (j.toString() != null) {
					this.ServiceCode = Integer.parseInt(j.toString());
				}
			} else if (obj != null && obj instanceof Integer) {
				this.ServiceCode = (Integer) obj;
			}
		}
		if (soapObject.hasProperty("Nom")) {
			Object obj = soapObject.getProperty("Nom");
			if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
				SoapPrimitive j = (SoapPrimitive) obj;
				if (j.toString() != null) {
					this.Nom = j.toString();
				}
			} else if (obj != null && obj instanceof String) {
				this.Nom = (String) obj;
			}
		}

	}

	@Override
	public Object getProperty(int propertyIndex) {
		if (propertyIndex == 0) {
			return ServiceCode;
		}
		if (propertyIndex == 1) {
			return Nom;
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 2;
	}

	@Override
	public void getPropertyInfo(int propertyIndex,
			@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		if (propertyIndex == +0) {
			info.type = PropertyInfo.INTEGER_CLASS;
			info.name = "ServiceCode";
			info.namespace = "http://etsmtl.ca/";
		}
		if (propertyIndex == +1) {
			info.type = PropertyInfo.STRING_CLASS;
			info.name = "Nom";
			info.namespace = "http://etsmtl.ca/";
		}
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}

}
