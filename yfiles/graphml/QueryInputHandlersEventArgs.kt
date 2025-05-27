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
import yfiles.collections.IEnumerable
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Specialized [EventArgs] that are used for dynamic [IInputHandler] registration.
 * @see [GraphMLIOHandler.addQueryInputHandlersListener]
 * @see [GraphMLParser.addQueryInputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs">Online Documentation</a>
 * 
 * @constructor Create a new instance.
 * @param [context] The current parse context.
 * @param [keyDefinition] The current key definition
 * @param [handlers] Stores the registered [IInputHandler] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs%23QueryInputHandlersEventArgs-constructor-QueryInputHandlersEventArgs">Online Documentation</a>
 */
external  class QueryInputHandlersEventArgs  ( context: IParseContext ,
 keyDefinition: Element ,
 handlers: IList<out IInputHandler> ) : EventArgs {

/**
 * Gets the [IParseContext] instance that can queried for further information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs%23context">Online Documentation</a>
 */
final val context: IParseContext
/**
 * Gets or sets whether the current GraphML attribute has been processed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets the [IInputHandler]s that have been registered on this event argument instance so far.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs%23handlers">Online Documentation</a>
 */
final val handlers: IEnumerable<IInputHandler>
/**
 * Gets the key definition of the GraphML attribute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs%23keyDefinition">Online Documentation</a>
 */
final val keyDefinition: Element
/**
 * Register an [IInputHandler] instance for the current [keyDefinition].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryInputHandlersEventArgs%23QueryInputHandlersEventArgs-method-addInputHandler">Online Documentation</a>
 */
 final   fun addInputHandler( handler: IInputHandler )

companion object : ClassMetadata<QueryInputHandlersEventArgs> {
}
}
