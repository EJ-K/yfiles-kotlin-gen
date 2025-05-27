// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

import js.array.ReadonlyArray
import kotlin.js.JsClass

/**
 * Instances of the class `Class` represent classes and interfaces in a running yFiles application.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class">Online Documentation</a>
 */
@JsName("Class")
external  class YClass<T : Any> 
private constructor ()  {

/**
 * `true`, if this type represents a regular class; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23isClass">Online Documentation</a>
 */
final val isClass: Boolean
/**
 * `true`, if this type represents an enum; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23isEnum">Online Documentation</a>
 */
final val isEnum: Boolean
/**
 * `true`, if this type represents a primitive type; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23isPrimitive">Online Documentation</a>
 */
final val isPrimitive: Boolean
/**
 * `true`, if this type represents a value type; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23isValueType">Online Documentation</a>
 */
final val isValueType: Boolean
/**
 * The short name of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23name">Online Documentation</a>
 */
final val name: String
/**
 * Returns all attributes that belong to this type.
 * @param [inherited] If `true`, then the attributes of the parent types are also added to the list. Default value is `false`.
 * @return An array of attributes that belong to this type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23Class-method-getAttributes">Online Documentation</a>
 */
 final   fun getAttributes( inherited: Boolean  = definedExternally):ReadonlyArray<Attribute>
/**
 * Tests whether an object is an instance of this type.
 * @param [o] The object that may be an instance of this type.
 * @return `true`, if the object is an instance of this type; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23Class-method-isInstance">Online Documentation</a>
 */
 final   fun isInstance( o: Any? ):Boolean /* o is T */
/**
 * Creates a new instance of this type using its default constructor.
 * @return A new instance of this type using its default constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23Class-method-newInstance">Online Documentation</a>
 */
 final   fun newInstance():T

companion object  {
/**
 * Makes sure the prototype of this type is properly set up and $class and getClass() is working as expected.
 * @param [type] The type
 * @param [name] The optional (short) name to use for class. This will be returned by getClass()/$class.name. This will be guessed from the function name if unspecified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Class%23Class-method-fixType">Online Documentation</a>
 */
@Deprecated(message = "For code generation only", level = DeprecationLevel.HIDDEN)
 final   fun fixType( type: JsClass<out YObject> ,
 name: String?  = definedExternally)
}
}
