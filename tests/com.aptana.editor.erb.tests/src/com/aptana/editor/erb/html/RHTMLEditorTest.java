/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.erb.html;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;

import com.aptana.editor.erb.common.ERBEditorTestCase;

public class RHTMLEditorTest extends ERBEditorTestCase
{

	@Override
	protected IFileStore getFileStore() throws Exception
	{
		return EFS.getStore((new File("testhtml.erb").toURI())); //$NON-NLS-1$
	}

	@Override
	protected String getClassName()
	{
		return RHTMLEditor.class.getName();
	}

	@Override
	protected String getEditorId()
	{
		return "com.aptana.editor.erb.html"; //$NON-NLS-1$
	}
}
