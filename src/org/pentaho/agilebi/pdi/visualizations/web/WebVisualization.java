package org.pentaho.agilebi.pdi.visualizations.web;

import org.pentaho.agilebi.pdi.modeler.VisualizeCanvas;
import org.pentaho.agilebi.pdi.visualizations.IVisualization;

public class WebVisualization implements IVisualization {

	private String url;
	private String description;

	public String getTitle() {
		return description;
	}

	public void setTitle(String aDescription) {
		description = aDescription;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String aUrl) {
		url = aUrl;
	}

	public void openVisualizer(String aModelName, String aDatabaseName) {
		VisualizeCanvas.openVisualizer(aModelName, aDatabaseName, url);
	}
}
