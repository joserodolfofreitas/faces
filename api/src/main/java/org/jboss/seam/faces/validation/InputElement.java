package org.jboss.seam.faces.validation;

import java.io.Serializable;

import javax.faces.component.UIInput;

import org.jboss.seam.solder.core.Veto;

/**
 * To be used in conjunction with <code>&lt;s:validateForm /&gt;</code> in Validators that should have their values fetched from
 * a JSF form field.
 * <p/>
 * Example of injection:
 *
 * @param <T> is the type of value the inputElement holds.
 * @author <a href="http://community.jboss.org/people/spinner)">Jose Rodolfo freitas</a>
 * @Inject private InputElement<String> firstName;
 * @Inject private InputElement<String> lastName;
 * @Inject private InputElement<Date> dateOfBirth;
 */
@Veto
public class InputElement<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String id;
    private final String clientId;
    private final UIInput component;
    private Object value;

    public InputElement(String id, String clientId, UIInput component) {
        super();
        this.id = id;
        this.clientId = clientId;
        this.component = component;
    }

    public String getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public UIInput getComponent() {
        return component;
    }

    public T getValue() {
        return (T) value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
