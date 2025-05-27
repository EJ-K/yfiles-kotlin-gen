// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import js.array.ReadonlyArray
import yfiles.lang.Attribute
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass

/**
 * Custom attribute to control specific aspects of GraphML deserialization.
 * @see [XamlSerializer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23GraphMLAttribute-constructor-GraphMLAttribute">Online Documentation</a>
 */
external open class GraphMLAttribute  () : Attribute {

/**
 * Specifies the property of a class that is used as the content property in XAML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23contentProperty">Online Documentation</a>
 */
final var contentProperty: String?
/**
 * Gets or sets the default value of the property this attribute is bound to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23defaultValue">Online Documentation</a>
 */
final var defaultValue: Any?
/**
 * Gets or sets a custom [IMarkupExtensionConverter] for attribute serialization.
 * @see [XamlSerializer]
 * @see [IMarkupExtensionConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23markupExtensionConverter">Online Documentation</a>
 */
final var markupExtensionConverter: YClass<*>?
/**
 * Gets or sets the name of the attributed member.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23name">Online Documentation</a>
 */
final var name: String?
/**
 * Gets or sets whether the object reference identity of the property values should be kept intact.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23shareable">Online Documentation</a>
 */
final var shareable: GraphMLSharingPolicy
/**
 * Types that should be searched for static field or property members of the annotated type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23singletonContainers">Online Documentation</a>
 */
final var singletonContainers: ReadonlyArray<YClass<*>>?
/**
 * Gets or sets the type of the [valueSerializer] implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23valueSerializer">Online Documentation</a>
 */
final var valueSerializer: YClass<*>?
/**
 * Gets or sets how a member should be visible to GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23visibility">Online Documentation</a>
 */
final var visibility: GraphMLMemberVisibility
/**
 * Gets or sets whether the member should be written as an XML element or as an XML attribute.
 * @see [XamlAttributeWritePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23writeAsAttribute">Online Documentation</a>
 */
final var writeAsAttribute: XamlAttributeWritePolicy
/**
 * Gets or sets whether an enclosing tag for the property itself is written.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23writeEnclosingTag">Online Documentation</a>
 */
final var writeEnclosingTag: Boolean
/**
 * Gets or sets the XML namespace URI for the member where this attribute is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLAttribute%23xmlNamespace">Online Documentation</a>
 */
final var xmlNamespace: String?

companion object : ClassMetadata<GraphMLAttribute> {
}
}

inline fun GraphMLAttribute(
    block: GraphMLAttribute.() -> Unit
): GraphMLAttribute {
    return GraphMLAttribute()
        .apply(block)
}
