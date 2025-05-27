// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import web.dom.Node
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This class defines a handler for key/data elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputHandler">Online Documentation</a>
 */
external interface IInputHandler : YObject {
/**
 * Gets the parse precedence that is associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputHandler%23precedence">Online Documentation</a>
 */
val precedence: ParsePrecedence
/**
 * This method is invoked when no data tag is defined, and the default value should be applied.
 * @param [context] the current parse context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputHandler%23IInputHandler-method-applyDefault">Online Documentation</a>
 */
   fun applyDefault( context: IParseContext )
/**
 * This method is invoked each time a data element with matching key is processed.
 * @param [context] the current parse context.
 * @param [node] the DOM node representing the data element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputHandler%23IInputHandler-method-parseData">Online Documentation</a>
 */
   fun parseData( context: IParseContext ,
 node: Node )

companion object : InterfaceMetadata<IInputHandler> {
}
}
