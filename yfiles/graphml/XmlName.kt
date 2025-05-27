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

/**
 * Represents an XML name consisting of a local (unqualified) name for an element or attribute and the URI of the namespace for that element or attribute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlName">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [XmlName] class.
 * @param [localName] The local name of the element.
 * @param [namespace] The namespace it belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlName%23XmlName-constructor-XmlName">Online Documentation</a>
 * 
 * @property localName
 * Gets or sets the local name.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlName%23localName">Online Documentation</a>
 * 
 * @property namespace
 * Gets the namespace.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlName%23namespace">Online Documentation</a>
 */
open external class XmlName (
final var localName: String,
final val namespace: String?)  {
  
  companion object : ClassMetadata<XmlName> {
    /**
     * Performs a conversion from [String] to [XmlName].
     * @param [expandedName] Name of the expanded.
     * @return The result of the conversion.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlName%23XmlName-method-convertFrom">Online Documentation</a>
     */
    fun convertFrom(
      expandedName: String,
    ): XmlName
  }
}
