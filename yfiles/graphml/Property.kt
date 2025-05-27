// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Wraps a property together with default values and meta data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property">Online Documentation</a>
 */
external open class Property  : YObject {

/**
 * Gets whether or not the property has a **public** getter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23canRead">Online Documentation</a>
 */
final val canRead: Boolean
/**
 * Gets whether or not the property has a **public** setter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23canWrite">Online Documentation</a>
 */
final val canWrite: Boolean
/**
 * Gets the [graphMLAttribute].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23graphMLAttribute">Online Documentation</a>
 */
final val graphMLAttribute: GraphMLAttribute?
/**
 * Gets a value indicating whether this instance has a default value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23hasDefaultValue">Online Documentation</a>
 */
final val hasDefaultValue: Boolean
/**
 * Gets a value indicating whether this instance is the one defined in the [GraphMLAttribute]'s [GraphMLAttribute.contentProperty].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23isContentProperty">Online Documentation</a>
 */
final val isContentProperty: Boolean
/**
 * Gets whether or not this is a static property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23isStatic">Online Documentation</a>
 */
final val isStatic: Boolean
/**
 * Gets the MarkupExtensionConverter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23markupExtensionConverter">Online Documentation</a>
 */
final val markupExtensionConverter: IMarkupExtensionConverter?
/**
 * Gets the name of the property, as it will appear in GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23name">Online Documentation</a>
 */
final val name: String
/**
 * Gets the type of the owner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23ownerType">Online Documentation</a>
 */
final val ownerType: YClass<*>
/**
 * Gets the serialization visibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23serializationVisibility">Online Documentation</a>
 */
final val serializationVisibility: GraphMLMemberVisibility
/**
 * Gets the type of the property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23type">Online Documentation</a>
 */
final val type: YClass<*>
/**
 * Gets the [valueSerializer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23valueSerializer">Online Documentation</a>
 */
final val valueSerializer: ValueSerializer?
/**
 * Gets the value the wrapped property has on the given instance.
 * @param [ownerInstance] The instance to get the property value from.
 * @return The value the wrapped property has on the given instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23Property-method-getValue">Online Documentation</a>
 */
 final   fun getValue( ownerInstance: Any? ):Any?
/**
 * Sets the value to the wrapped property on the given instance.
 * @param [ownerInstance] The instance to set the property value on.
 * @param [value] The value to set.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Property%23Property-method-setValue">Online Documentation</a>
 */
 final   fun setValue( ownerInstance: Any? ,
 value: Any? )

companion object : ClassMetadata<Property> {
}
}
