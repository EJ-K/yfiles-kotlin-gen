// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Event argument implementation that is used by the [query-output-handlers][GraphMLIOHandler] event.
 * @see [GraphMLIOHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryOutputHandlersEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [QueryOutputHandlersEventArgs] class.
 * @param [context] The context to assign to the [context][QueryOutputHandlersEventArgs] property.
 * @param [scope] The scope where the handlers should be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryOutputHandlersEventArgs%23QueryOutputHandlersEventArgs-constructor-QueryOutputHandlersEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context for which the handlers are queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryOutputHandlersEventArgs%23context">Online Documentation</a>
 * 
 * @property scope
 * Gets the scope where the handlers should be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryOutputHandlersEventArgs%23scope">Online Documentation</a>
 */
external class QueryOutputHandlersEventArgs (
final val context: IWriteContext,
final val scope: KeyScope) : EventArgs {
  /**
   * Gets the [IOutputHandler]s that have been registered on this event argument instance so far.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryOutputHandlersEventArgs%23handlers">Online Documentation</a>
   */
  final val handlers: IEnumerable<IOutputHandler>
  
  /**
   * Adds the given output handler to the set of registered output handlers for the given scope.
   * @param [handler] The handler to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryOutputHandlersEventArgs%23QueryOutputHandlersEventArgs-method-addOutputHandler">Online Documentation</a>
   */
  fun addOutputHandler(
    handler: IOutputHandler,
  )
  
  companion object : ClassMetadata<QueryOutputHandlersEventArgs> {
  }
}
