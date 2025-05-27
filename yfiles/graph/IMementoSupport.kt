// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface provides access to the memento design pattern to provide undoability for arbitrary models.
 * @see [ILookup]
 * @see [ICompoundEdit]
 * @see [UndoEngine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMementoSupport">Online Documentation</a>
 */
external interface IMementoSupport<in T, S> : YObject {
/**
 * Reapplies a previously queried state object to a given subject.
 * @param [subject] The subject to modify the state.
 * @param [state] The state object as returned by [getState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMementoSupport%23IMementoSupport-method-applyState">Online Documentation</a>
 */
   fun applyState( subject: T ,
 state: S )
/**
 * Retrieves an object representing the state at the moment this method is called.
 * @param [subject] The subject to read the state from
 * @return An object that describes the current state of `subject`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMementoSupport%23IMementoSupport-method-getState">Online Documentation</a>
 */
   fun getState( subject: T ):S
/**
 * Determines whether two state objects are equal.
 * @param [state1] The first state as obtained from [getState]
 * @param [state2] The second state as obtained from [getState]
 * @return `true` if the states are equal; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMementoSupport%23IMementoSupport-method-stateEquals">Online Documentation</a>
 */
   fun stateEquals( state1: S ,
 state2: S ):Boolean

companion object : InterfaceMetadata<IMementoSupport<*, *>> {
}
}
