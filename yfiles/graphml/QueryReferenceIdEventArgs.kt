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
 * Event arguments for calls to the [GraphMLIOHandler.QueryReferenceId] or [GraphMLWriter.QueryReferenceId] events.
 * @see [GraphMLIOHandler.addQueryReferenceIdListener]
 * @see [GraphMLWriter.addQueryReferenceIdListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @param [context] The current write context that can be used by the event handler for additional information.
 * @param [value] The referenced object instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs%23QueryReferenceIdEventArgs-constructor-QueryReferenceIdEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the current write context that can be used by the event handler for additional information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs%23context">Online Documentation</a>
 * 
 * @property value
 * Gets the reference value that is encapsulated by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs%23value">Online Documentation</a>
 */
external open class QueryReferenceIdEventArgs  (
final val context: IWriteContext,
final val value: Any) : EventArgs {

/**
 * Gets whether the last event handler invocation has actually handled the event.
 * @see [referenceId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs%23handled">Online Documentation</a>
 */
final val handled: Boolean
/**
 * Gets or sets the reference id that should be evaluated by the event handler.
 * @see [handled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs%23referenceId">Online Documentation</a>
 */
final var referenceId: ElementId?
/**
 * Gets or sets the type of the reference being queried.
 * @see [referenceId]
 * @see [handled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryReferenceIdEventArgs%23referenceType">Online Documentation</a>
 */
final var referenceType: GraphMLReferenceType

companion object : ClassMetadata<QueryReferenceIdEventArgs> {
}
}
