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
 * Represents a unit of work that can be undone and redone.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit">Online Documentation</a>
 */
external interface IUndoUnit : YObject {
/**
 * Gets the name of the redo unit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23redoName">Online Documentation</a>
 */
val redoName: String
/**
 * Gets the name of the undo unit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23undoName">Online Documentation</a>
 */
val undoName: String
/**
 * Called by the [UndoEngine] and client code to let the unit dispose of references aren't needed anymore.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-dispose">Online Documentation</a>
 */
   fun dispose()
/**
 * Redoes the work that is represented by this unit.
 * @see [redoName]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-redo">Online Documentation</a>
 */
   fun redo()
/**
 * Tries to merge the given unit with this one.
 * @param [unit] The unit to incorporate that happened after this unit.
 * @return Whether the state change of `unit` has been incorporated into this unit and `unit` can be disposed of.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-tryMergeUnit">Online Documentation</a>
 */
   fun tryMergeUnit( unit: IUndoUnit ):Boolean
/**
 * Tries to replace the given unit with this one.
 * @param [unit] The unit to incorporate that happened before this unit.
 * @return Whether the state change of `this` unit has been incorporated into the given `unit` and `this` can be disposed of.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-tryReplaceUnit">Online Documentation</a>
 */
   fun tryReplaceUnit( unit: IUndoUnit ):Boolean
/**
 * Undoes the work that is represented by this unit.
 * @see [undoName]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-undo">Online Documentation</a>
 */
   fun undo()

companion object : InterfaceMetadata<IUndoUnit> {
}
}
