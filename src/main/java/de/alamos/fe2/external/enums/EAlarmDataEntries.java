package de.alamos.fe2.external.enums;

public enum EAlarmDataEntries
{
	TEXT("message"),
	STREET("street"),
	HOUSE("house"),
	CITY("city"),
	POSTALCODE("postalCode"),
	BUILDING_NAME("building"),
	LOCATION_ADDITIOnAL("location_additional"),
	KEYWORD("keyword"),
	KEYWORD_DESCRIPTION("keyword_description"),
	KEYWORD_IDENTIFICATION("keyword_ident"),
	KEYWORD_ADDITIONAL("keyword_misc"),
	KEYWORD_CATEGORY("keyword_category"),
	CALLER("caller"),
	CALLER_CONTACT("caller_contact"),
	LAT("lat"),
	LNG("lng"),
	DESTINATION("location_dest");

	private final String key;

	private EAlarmDataEntries(final String key)
	{
		this.key = key;
	}

	public String getKey()
	{
		return key;
	}
}