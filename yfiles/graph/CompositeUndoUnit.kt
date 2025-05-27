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
 * A group of [IUndoUnit]s that are undone/redone as a single unit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided names.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-constructor-CompositeUndoUnit">Online Documentation</a>
 */
external open class CompositeUndoUnit  ( undoName: String?  = definedExternally,
 redoName: String?  = definedExternally) : IUndoUnit {

/**
 * Gets the number of units that are contained in this compound unit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23count">Online Documentation</a>
 */
final val count: Int
/**
 * Gets whether this instance has been [disposed.][dispose]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23disposed">Online Documentation</a>
 */
final val disposed: Boolean
/**
 * Gets or sets the current redo name.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23redoName">Online Documentation</a>
 */
final override var redoName: String
/**
 * Gets or sets the current undo name.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23undoName">Online Documentation</a>
 */
final override var undoName: String
/**
 * Adds a new [IUndoUnit] to the queue.
 * @param [unit] The unit of work to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-add">Online Documentation</a>
 */
 open   fun add( unit: IUndoUnit )

/**
 * Adds a new [IUndoUnit] to the queue.
 * @param [unit] The unit of work to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( unit: IUndoUnit )
/**
 * Determines whether a call to [redo] can be made.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-canRedo">Online Documentation</a>
 */
 open   fun canRedo():Boolean
/**
 * Determines whether a call to [undo] can be made.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-canUndo">Online Documentation</a>
 */
 open   fun canUndo():Boolean
/**
 * Clears the internal collection of units.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Disposes this unit and all of its contents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-dispose">Online Documentation</a>
 */
 final override   fun dispose()
/**
 * Redoes the next [IUndoUnit].
 * @throws NotSupportedError If an undo operation is already in progress.
 * @throws Error If [canRedo] would yield `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-redo">Online Documentation</a>
 */
 override   fun redo()
/**
 * Tries to remove a given unit from this compound unit.
 * @param [unit] The unit to remove.
 * @return `true` iff the unit has been removed from this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-removeUnit">Online Documentation</a>
 */
 open   fun removeUnit( unit: IUndoUnit ):Boolean
/**
 * Implements the [IUndoUnit] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-tryMergeUnit">Online Documentation</a>
 */
 final override   fun tryMergeUnit( unit: IUndoUnit ):Boolean
/**
 * Implements the [IUndoUnit] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-tryReplaceUnit">Online Documentation</a>
 */
 final override   fun tryReplaceUnit( unit: IUndoUnit ):Boolean
/**
 * Undoes the next [IUndoUnit].
 * @throws NotSupportedError If an undo operation is already in progress.
 * @throws Error If [canUndo] would yield `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeUndoUnit%23CompositeUndoUnit-method-undo">Online Documentation</a>
 */
 override   fun undo()

companion object : ClassMetadata<CompositeUndoUnit> {
}
}

inline fun CompositeUndoUnit(
    block: CompositeUndoUnit.() -> Unit
): CompositeUndoUnit {
    return CompositeUndoUnit()
        .apply(block)
}
