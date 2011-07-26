/**
 * <copyright>
 * </copyright>
 *

 */
package org.wesnoth.wml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WML Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wesnoth.wml.WMLKey#getValue <em>Value</em>}</li>
 *   <li>{@link org.wesnoth.wml.WMLKey#getEol <em>Eol</em>}</li>
 *   <li>{@link org.wesnoth.wml.WMLKey#get_cardinality <em>cardinality</em>}</li>
 *   <li>{@link org.wesnoth.wml.WMLKey#is_Enum <em>Enum</em>}</li>
 *   <li>{@link org.wesnoth.wml.WMLKey#is_Translatable <em>Translatable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wesnoth.wml.WmlPackage#getWMLKey()
 * @model
 * @generated
 */
public interface WMLKey extends WMLExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link org.wesnoth.wml.WMLKeyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see org.wesnoth.wml.WmlPackage#getWMLKey_Value()
   * @model containment="true"
   * @generated
   */
  EList<WMLKeyValue> getValue();

  /**
   * Returns the value of the '<em><b>Eol</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eol</em>' attribute.
   * @see #setEol(String)
   * @see org.wesnoth.wml.WmlPackage#getWMLKey_Eol()
   * @model default=""
   * @generated
   */
  String getEol();

  /**
   * Sets the value of the '{@link org.wesnoth.wml.WMLKey#getEol <em>Eol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eol</em>' attribute.
   * @see #getEol()
   * @generated
   */
  void setEol(String value);

  /**
   * Returns the value of the '<em><b>cardinality</b></em>' attribute.
   * The default value is <code>" "</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>cardinality</em>' attribute.
   * @see #set_cardinality(char)
   * @see org.wesnoth.wml.WmlPackage#getWMLKey__cardinality()
   * @model default=" "
   * @generated
   */
  char get_cardinality();

  /**
   * Sets the value of the '{@link org.wesnoth.wml.WMLKey#get_cardinality <em>cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>cardinality</em>' attribute.
   * @see #get_cardinality()
   * @generated
   */
  void set_cardinality(char value);

  /**
   * Returns the value of the '<em><b>Enum</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' attribute.
   * @see #set_Enum(boolean)
   * @see org.wesnoth.wml.WmlPackage#getWMLKey__Enum()
   * @model default="false"
   * @generated
   */
  boolean is_Enum();

  /**
   * Sets the value of the '{@link org.wesnoth.wml.WMLKey#is_Enum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #is_Enum()
   * @generated
   */
  void set_Enum(boolean value);

  /**
   * Returns the value of the '<em><b>Translatable</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translatable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translatable</em>' attribute.
   * @see #set_Translatable(boolean)
   * @see org.wesnoth.wml.WmlPackage#getWMLKey__Translatable()
   * @model default="false"
   * @generated
   */
  boolean is_Translatable();

  /**
   * Sets the value of the '{@link org.wesnoth.wml.WMLKey#is_Translatable <em>Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Translatable</em>' attribute.
   * @see #is_Translatable()
   * @generated
   */
  void set_Translatable(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return _cardinality == \'1\';'"
   * @generated
   */
  boolean is_Required();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return _cardinality == \'-\';'"
   * @generated
   */
  boolean is_Forbidden();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return _cardinality == \'?\';'"
   * @generated
   */
  boolean is_Optional();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return _cardinality == \'*\';'"
   * @generated
   */
  boolean is_Repeatable();

} // WMLKey
