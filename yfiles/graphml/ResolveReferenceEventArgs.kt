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
import yfiles.lang.EventArgs

/**
 * Event arguments for calls to the [resolve-reference][GraphMLIOHandler] and [override-resolve-reference][GraphMLIOHandler] events.
 * @see [GraphMLIOHandler.resolve-reference]
 * @see [GraphMLIOHandler.override-resolve-reference]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResolveReferenceEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ResolveReferenceEventArgs].
 * @param [context] The current parse context that can be used by the event handler for additional information.
 * @param [referenceId] The reference id that should be evaluated by the event handler.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResolveReferenceEventArgs%23ResolveReferenceEventArgs-constructor-ResolveReferenceEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the current parse context that can be used by the event handler for additional information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResolveReferenceEventArgs%23context">Online Documentation</a>
 * 
 * @property referenceId
 * Gets the reference ID that should be evaluated by the event handler.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResolveReferenceEventArgs%23referenceId">Online Documentation</a>
 */
external class ResolveReferenceEventArgs (
final val context: IParseContext,
final val referenceId: ElementId) : EventArgs {
  /**
   * Gets whether the last event handler invocation has actually handled the event.
   * @see [value]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResolveReferenceEventArgs%23handled">Online Documentation</a>
   */
  final val handled: Boolean
  
  /**
   * Gets or sets the reference value that is encapsulated by this instance.
   * @see [handled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResolveReferenceEventArgs%23value">Online Documentation</a>
   */
  final var value: Any
  
  companion object : ClassMetadata<ResolveReferenceEventArgs> {
  }
}
