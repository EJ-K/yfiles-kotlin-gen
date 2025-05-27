// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata

/**
 * An abstract base implementation of [IUndoUnit].
 * @see [IUndoUnit]
 * @see [UndoEngine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given name as undo and redo name.
 * @param [undoName] The undo name.
 * @param [redoName] The redo name.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23UndoUnitBase-constructor-UndoUnitBase">Online Documentation</a>
 */
external abstract class UndoUnitBase 
protected constructor ( undoName: String ,
 redoName: String?  = definedExternally) : IUndoUnit {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23redoName">Online Documentation</a>
 */
override val redoName: String
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23undoName">Online Documentation</a>
 */
final override val undoName: String
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23UndoUnitBase-method-dispose">Online Documentation</a>
 */
 override   fun dispose()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23UndoUnitBase-method-redo">Online Documentation</a>
 */
 abstract override   fun redo()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23UndoUnitBase-method-tryMergeUnit">Online Documentation</a>
 */
 override   fun tryMergeUnit( unit: IUndoUnit ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23UndoUnitBase-method-tryReplaceUnit">Online Documentation</a>
 */
 override   fun tryReplaceUnit( unit: IUndoUnit ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoUnitBase%23UndoUnitBase-method-undo">Online Documentation</a>
 */
 abstract override   fun undo()

companion object : ClassMetadata<UndoUnitBase> {
}
}
