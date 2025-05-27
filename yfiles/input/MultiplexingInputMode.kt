// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.Cursor

/**
 * A composite [IInputMode] implementation that additionally can deal with [ConcurrencyController.exclusive] instances.
 * @see [mutexOwner]
 * @see [add]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode">Online Documentation</a>
 * 
 * @constructor Creates an instance with no initial modes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-constructor-MultiplexingInputMode">Online Documentation</a>
 */
external open class MultiplexingInputMode  () : IInputMode {

/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the cursor to use whenever no child mode prefers a different cursor.
 * 
 * The default is `null`
 * @see [adjustCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23defaultCursor">Online Documentation</a>
 */
final var defaultCursor: Cursor?
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets the [IInputMode] that currently owns the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23mutexOwner">Online Documentation</a>
 */
final val mutexOwner: IInputMode?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Adds the given `mode`.
 * @param [mode] The input mode to add to this mode.
 * @throws ArgumentError If the same `mode` has is already added to this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-add">Online Documentation</a>
 */
 final   fun add( mode: IInputMode )

/**
 * Adds the given `mode`.
 * @param [mode] The input mode to add to this mode.
 * @throws ArgumentError If the same `mode` has is already added to this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( mode: IInputMode )
/**
 * Adjusts the cursor of the [CanvasComponent][yfiles.view.CanvasComponent] according to the current input mutex owner or the first mode in the list whose [ConcurrencyController] returns a non-null [ConcurrencyController.preferredCursor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-adjustCursor">Online Documentation</a>
 */
 open   fun adjustCursor()
/**
 * Cancels all modes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Called by the [child context's][createChildInputModeContext] [ILookup.lookup][yfiles.graph.ILookup.lookup] method.
 * @param [type] The type argument passed to [ILookup.lookup][yfiles.graph.ILookup.lookup].
 * @return The result of the lookup query, or `null`.
 * @see [createChildInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-childInputModeContextLookup">Online Documentation</a>
 */
 open protected   fun <T : YObject>childInputModeContextLookup( type: YClass<T> ):T?
/**
 * Yields an [IInputModeContext] for the child modes of this mode.
 * @return A new instance that delegates to the [parent's context.][inputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-createChildInputModeContext">Online Documentation</a>
 */
 open protected   fun createChildInputModeContext():IInputModeContext
/**
 * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
 * @param [context] An input mode context that is available in the [InputModeEventArgs].
 *   Can be `null` in which case a new context for this instance is created automatically.
 * @return An input mode event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-createInputModeEventArgs">Online Documentation</a>
 */
 open protected   fun createInputModeEventArgs( context: IInputModeContext? ):InputModeEventArgs
/**
 * Returns a list of all modes managed by this instance in sorted order.
 * @return A list of the modes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-getSortedModes">Online Documentation</a>
 */
 final   fun getSortedModes():IList<out IInputMode>
/**
 * Performs one-time initialization of this instance.
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-initialize">Online Documentation</a>
 */
 open protected   fun initialize()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * [Invalidates][yfiles.view.CanvasComponent.invalidate] the canvas this mode is currently installed in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-invalidate">Online Documentation</a>
 */
 open protected   fun invalidate()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Removes the given mode from this compound mode.
 * @param [mode] The mode to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-remove">Online Documentation</a>
 */
 final   fun remove( mode: IInputMode )

/**
 * Removes the given mode from this compound mode.
 * @param [mode] The mode to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( mode: IInputMode )
/**
 * Called when the [IInputMode.priority] of an [installed][add] sub mode has changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-subModePriorityChanged">Online Documentation</a>
 */
 final protected   fun subModePriorityChanged()
/**
 * Tries to stop all modes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiplexingInputMode%23MultiplexingInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )

companion object : ClassMetadata<MultiplexingInputMode> {
}
}

inline fun MultiplexingInputMode(
    block: MultiplexingInputMode.() -> Unit
): MultiplexingInputMode {
    return MultiplexingInputMode()
        .apply(block)
}
