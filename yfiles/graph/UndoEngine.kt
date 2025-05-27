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
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventHandler
import yfiles.lang.TimeSpan

/**
 * The main class to provide undo and redo functionality.
 * @see [IUndoUnit]
 * @see [UndoUnitBase]
 * @see [IMementoSupport]
 * @see [ICompoundEdit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [UndoEngine] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-constructor-UndoEngine">Online Documentation</a>
 */
external open class UndoEngine  () : IPropertyObservable {

/**
 * Gets or sets the duration during which the engine will try to merge newly added units.
 * @see [mergeUnits]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23autoMergeTime">Online Documentation</a>
 */
final var autoMergeTime: TimeSpan
/**
 * Gets or sets a value that indicates whether or not this instance should try to merge newly added units.
 * @see [autoMergeTime]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23mergeUnits">Online Documentation</a>
 */
final var mergeUnits: Boolean
/**
 * Gets whether this instance is currently performing a redo operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23performingRedo">Online Documentation</a>
 */
final val performingRedo: Boolean
/**
 * Gets whether this instance is currently performing an undo operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23performingUndo">Online Documentation</a>
 */
final val performingUndo: Boolean
/**
 * Gets the [IUndoUnit.redoName] of the next [redo] operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23redoName">Online Documentation</a>
 */
final val redoName: String
/**
 * Gets or sets the maximum size of the undo queue this instance is managing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23size">Online Documentation</a>
 */
final var size: Int
/**
 * Gets the [IUndoUnit.undoName] of the next [undo] operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23undoName">Online Documentation</a>
 */
final val undoName: String
/**
 * Adds a new [IUndoUnit] to the queue.
 * @param [unit] The unit of work to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-addUnit">Online Documentation</a>
 */
 open   fun addUnit( unit: IUndoUnit )
/**
 * Begins a compound edit that will use the provided name.
 * @param [undoName] The undo name to use for the edit.
 * @param [redoName] The redo name to use for the edit.
 * @return A compound edit implementation that needs to be [canceled][ICompoundEdit.cancel] or [committed][ICompoundEdit.commit] later.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-beginCompoundEdit">Online Documentation</a>
 */
 open   fun beginCompoundEdit( undoName: String? ,
 redoName: String? ):ICompoundEdit
/**
 * Determines whether a call to [redo] can be made.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-canRedo">Online Documentation</a>
 */
 open   fun canRedo():Boolean
/**
 * Determines whether a call to [undo] can be made.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-canUndo">Online Documentation</a>
 */
 open   fun canUndo():Boolean
/**
 * Clears the internal queue and [disposes][IUndoUnit.dispose] all units in it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Returns a token that can be used to store and compare the state of the undo queue.
 * @return An object that can be checked against other tokens via the [YObject.equals][yfiles.lang.YObject.equals] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-getToken">Online Documentation</a>
 */
 open   fun getToken():Any
/**
 * This will trigger the corresponding [PropertyChanged] event.
 * @param [name] The name of the property that changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( name: String )
/**
 * Redoes the next [IUndoUnit].
 * @throws InvalidOperationError If an undo operation is already in progress or if [canRedo] would yield `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-redo">Online Documentation</a>
 */
 open   fun redo()
/**
 * Undoes the next [IUndoUnit].
 * @throws InvalidOperationError If an undo operation is already in progress or if [canUndo] would yield `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UndoEngine-method-undo">Online Documentation</a>
 */
 open   fun undo()
/**
 * Occurs when [canUndo], [canRedo], [undoName], or [redoName] changed its value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs when the engine has successfully executed the [IUndoUnit.undo] operation of an [IUndoUnit].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UnitUndone">Online Documentation</a>
 */
fun addUnitUndoneListener(listener: EventHandler1<EventArgs>)
fun removeUnitUndoneListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the engine has successfully executed the [IUndoUnit.redo] operation of an [IUndoUnit].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UnitRedone">Online Documentation</a>
 */
fun addUnitRedoneListener(listener: EventHandler1<EventArgs>)
fun removeUnitRedoneListener(listener: EventHandler1<EventArgs>)

companion object : ClassMetadata<UndoEngine> {
}
}

inline fun UndoEngine(
    block: UndoEngine.() -> Unit
): UndoEngine {
    return UndoEngine()
        .apply(block)
}

/**
 * Occurs when the engine has successfully executed the [IUndoUnit.undo] operation of an [IUndoUnit].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UnitUndone">Online Documentation</a>
 */
inline fun  UndoEngine.addUnitUndoneHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addUnitUndoneListener(listener)
    return { removeUnitUndoneListener(listener) }
}
/**
 * Occurs when the engine has successfully executed the [IUndoUnit.redo] operation of an [IUndoUnit].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndoEngine%23UnitRedone">Online Documentation</a>
 */
inline fun  UndoEngine.addUnitRedoneHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addUnitRedoneListener(listener)
    return { removeUnitRedoneListener(listener) }
}
