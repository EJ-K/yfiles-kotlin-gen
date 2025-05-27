// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import web.dom.Element
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An implementation that can read (a subset of) XAML formatted XML content.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlReader">Online Documentation</a>
 */
external  class XamlReader 
private constructor () : YObject {

/**
 * Deserializes the specified element node in the context to an instance.
 * @param [context] The context.
 * @param [element] The XML element node.
 * @return The instance that is described in the XML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlReader%23XamlReader-method-deserialize">Online Documentation</a>
 */
 final   fun deserialize( context: IParseContext ,
 element: Element ):Any?

companion object : ClassMetadata<XamlReader> {
/**
 * A singleton instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlReader%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: XamlReader
}
}
