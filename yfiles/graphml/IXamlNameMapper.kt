// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Facilitates determining type information from XML elements and writing of markup extensions as attributes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXamlNameMapper">Online Documentation</a>
 */
external interface IXamlNameMapper : YObject {
/**
 * Returns a [Class][yfiles.lang.Class] that matches the given `fqTagName` of an XML element.
 * @param [context] The current parse context.
 * @param [fqTagName] The fully qualified XML element name that must describe a valid type in this CLR namespace.
 * @return The first matching type, if any.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXamlNameMapper%23IXamlNameMapper-method-getClassForName">Online Documentation</a>
 */
   fun getClassForName( context: IParseContext ,
 fqTagName: XmlName ):YClass<*>?
/**
 * Returns the XML tag name that belongs to type `type`
 * @param [context] The current write context.
 * @param [type] The type for which an XML namespace mapping is searched.
 * @return the XML tag name that belongs to type `type`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXamlNameMapper%23IXamlNameMapper-method-getNameForClass">Online Documentation</a>
 */
   fun getNameForClass( context: IWriteContext ,
 type: YClass<*> ):XmlName

companion object : InterfaceMetadata<IXamlNameMapper> {
}
}
