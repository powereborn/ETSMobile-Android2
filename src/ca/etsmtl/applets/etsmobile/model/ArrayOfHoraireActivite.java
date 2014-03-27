package ca.etsmtl.applets.etsmobile.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 2.0.0.4
//
// Created by Quasar Development at 15-01-2014
//
//---------------------------------------------------

import java.util.Hashtable;
import java.util.Vector;

import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import ca.etsmtl.applets.etsmobile.http.soap.ExtendedSoapSerializationEnvelope;

public class ArrayOfHoraireActivite extends Vector<HoraireActivite> implements
		KvmSerializable {

	public ArrayOfHoraireActivite() {
	}

	public ArrayOfHoraireActivite(AttributeContainer inObj,
			ExtendedSoapSerializationEnvelope envelope) {
		if (inObj == null)
			return;
		SoapObject soapObject = (SoapObject) inObj;
		int size = soapObject.getPropertyCount();
		for (int i0 = 0; i0 < size; i0++) {
			Object obj = soapObject.getProperty(i0);
			if (obj != null && obj instanceof AttributeContainer) {
				AttributeContainer j = (AttributeContainer) soapObject
						.getProperty(i0);
				HoraireActivite j1 = (HoraireActivite) envelope.get(j,
						HoraireActivite.class);
				add(j1);
			}
		}
	}

	@Override
	public Object getProperty(int arg0) {
		return this.get(arg0);
	}

	@Override
	public int getPropertyCount() {
		return this.size();
	}

	@Override
	public void getPropertyInfo(int index,
			@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		info.name = "HoraireActivite";
		info.type = HoraireActivite.class;
		info.namespace = "http://etsmtl.ca/";
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}
}