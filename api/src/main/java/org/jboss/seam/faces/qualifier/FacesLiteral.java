package org.jboss.seam.faces.qualifier;

import javax.enterprise.util.AnnotationLiteral;


/**
 * This class provides the AnnotationLiteral for the <code>Faces</code> qualifier
 *
 * @author <a href="mailto:bleathem@gmail.com">Brian Leathem</a>
 */
public class FacesLiteral extends AnnotationLiteral<Faces> implements Faces {
    private static final long serialVersionUID = 1L;

    public static final Faces INSTANCE = new FacesLiteral();
}
