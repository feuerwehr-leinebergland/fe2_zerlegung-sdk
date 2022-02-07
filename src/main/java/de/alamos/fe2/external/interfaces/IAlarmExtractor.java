package de.alamos.fe2.external.interfaces;

import java.util.Map;

public interface IAlarmExtractor
{
	Map<String, String> extract(String paramString);
}