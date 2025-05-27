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
import yfiles.lang.EventArgs

/**
 * This is the event argument that is used by the [IParseEvents] interface that can be queried from the [parseEvents][IParseContext] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParseEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ParseEventArgs] class.
 * @param [context] The context to assign to [context][ParseEventArgs].
 * @param [element] The XML element to assign to [element][ParseEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParseEventArgs%23ParseEventArgs-constructor-ParseEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context that is being used for parsing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParseEventArgs%23context">Online Documentation</a>
 * 
 * @property element
 * Gets the XML element that is currently parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParseEventArgs%23element">Online Documentation</a>
 */
external class ParseEventArgs (
final val context: IParseContext,
final val element: Element?) : EventArgs {
  
  companion object : ClassMetadata<ParseEventArgs> {
  }
}
