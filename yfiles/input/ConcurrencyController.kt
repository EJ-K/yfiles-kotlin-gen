// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YObject
import yfiles.view.Cursor

/**
 * A controller class that manages a single [IInputMode] implementation.
 * @see [IInputMode]
 * @see [MultiplexingInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController">Online Documentation</a>
 * 
 * @constructor Creates an instance that can be used to [IInputMode.install] the given `mode`.
 * @param [mode] The mode, the [ConcurrencyController] shall be created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-constructor-ConcurrencyController">Online Documentation</a>
 */
external  class ConcurrencyController  ( mode: IInputMode ) : YObject, IEventDispatcher {

/**
 * Gets if this controller is active.
 * @see [addActiveChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23active">Online Documentation</a>
 */
final val active: Boolean
/**
 * Gets or sets if this controller is enabled.
 * @see [active]
 * @see [addActiveChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23enabled">Online Documentation</a>
 */
final var enabled: Boolean
/**
 * Gets or sets a value indicating whether this controller will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets the current owner of the input mutex or `null` if no mode currently owns the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23mutexOwner">Online Documentation</a>
 */
final val mutexOwner: IInputMode?
/**
 * Gets or sets the cursor the associated mode of this controller would like to have displayed in the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23preferredCursor">Online Documentation</a>
 */
final var preferredCursor: Cursor?
/**
 * Determines if the mutex can be successfully requested currently.
 * @return Whether a call to [requestMutex] would currently succeed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-canRequestMutex">Online Documentation</a>
 */
 final   fun canRequestMutex():Boolean
/**
 * Determines whether this instance owns the input mutex.
 * @return Whether this instance has the input mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-hasMutex">Online Documentation</a>
 */
 final   fun hasMutex():Boolean
/**
 * Triggers a [PriorityChanged] event with [EventArgs.EMPTY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-onPriorityChanged">Online Documentation</a>
 */
 final   fun onPriorityChanged()
/**
 * Releases the input mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-releaseMutex">Online Documentation</a>
 */
 final   fun releaseMutex()
/**
 * Can be called to request an input mutex for the input mode.
 * @throws Error If the mutex could not be obtained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-requestMutex">Online Documentation</a>
 */
 final   fun requestMutex()
/**
 * Occurs when the mutex has been successfully obtained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23MutexObtained">Online Documentation</a>
 */
fun addMutexObtainedListener(listener: EventHandler1<EventArgs>)
fun removeMutexObtainedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the mutex has been released.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23MutexReleased">Online Documentation</a>
 */
fun addMutexReleasedListener(listener: EventHandler1<EventArgs>)
fun removeMutexReleasedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs the [active] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ActiveChanged">Online Documentation</a>
 */
fun addActiveChangedListener(listener: EventHandler1<EventArgs>)
fun removeActiveChangedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [preferredCursor] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23PreferredCursorChanged">Online Documentation</a>
 */
fun addPreferredCursorChangedListener(listener: EventHandler1<EventArgs>)
fun removePreferredCursorChangedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when [onPriorityChanged] is called by the associated mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23PriorityChanged">Online Documentation</a>
 */
fun addPriorityChangedListener(listener: EventHandler1<EventArgs>)
fun removePriorityChangedListener(listener: EventHandler1<EventArgs>)

companion object : ClassMetadata<ConcurrencyController> {
}
}

/**
 * Occurs when the mutex has been successfully obtained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23MutexObtained">Online Documentation</a>
 */
inline fun  ConcurrencyController.addMutexObtainedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addMutexObtainedListener(listener)
    return { removeMutexObtainedListener(listener) }
}
/**
 * Occurs when the mutex has been released.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23MutexReleased">Online Documentation</a>
 */
inline fun  ConcurrencyController.addMutexReleasedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addMutexReleasedListener(listener)
    return { removeMutexReleasedListener(listener) }
}
/**
 * Occurs the [active] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ActiveChanged">Online Documentation</a>
 */
inline fun  ConcurrencyController.addActiveChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addActiveChangedListener(listener)
    return { removeActiveChangedListener(listener) }
}
/**
 * Occurs when the [preferredCursor] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23PreferredCursorChanged">Online Documentation</a>
 */
inline fun  ConcurrencyController.addPreferredCursorChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addPreferredCursorChangedListener(listener)
    return { removePreferredCursorChangedListener(listener) }
}
/**
 * Occurs when [onPriorityChanged] is called by the associated mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23PriorityChanged">Online Documentation</a>
 */
inline fun  ConcurrencyController.addPriorityChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addPriorityChangedListener(listener)
    return { removePriorityChangedListener(listener) }
}
