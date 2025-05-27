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
import yfiles.view.Cursor

/**
 * A controller class that manages a single [IInputMode] implementation.
 * @see [IInputMode]
 * @see [MultiplexingInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController">Online Documentation</a>
 * 
 * @constructor Creates an instance that can be used to [install][IInputMode] the given `mode`.
 * @param [mode] The mode, the [ConcurrencyController] shall be created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-constructor-ConcurrencyController">Online Documentation</a>
 */
external class ConcurrencyController (
  mode: IInputMode,
) : IEventDispatcher {
  /**
   * Gets if this controller is active.
   * @see [active-changed]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23active">Online Documentation</a>
   */
  final val active: Boolean
  
  /**
   * Gets or sets if this controller is enabled.
   * @see [active]
   * @see [active-changed]
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
   * @return Whether a call to [requestMutex][ConcurrencyController] would currently succeed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-canRequestMutex">Online Documentation</a>
   */
  fun canRequestMutex(): Boolean
  
  /**
   * Determines whether this instance owns the input mutex.
   * @return Whether this instance has the input mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-hasMutex">Online Documentation</a>
   */
  fun hasMutex(): Boolean
  
  /**
   * Triggers a [priority-changed][ConcurrencyController] event with [EMPTY][EventArgs].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-onPriorityChanged">Online Documentation</a>
   */
  fun onPriorityChanged()
  
  /**
   * Releases the input mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-releaseMutex">Online Documentation</a>
   */
  fun releaseMutex()
  
  /**
   * Can be called to request an input mutex for the input mode.
   * @throws Error If the mutex could not be obtained.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23ConcurrencyController-method-requestMutex">Online Documentation</a>
   */
  fun requestMutex()
  
  companion object : ClassMetadata<ConcurrencyController> {
  }
}

/**
 * `mutex-obtained`: Occurs when the mutex has been successfully obtained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23mutex-obtained">Online Documentation</a>
 */
inline fun  ConcurrencyController.addMutexObtainedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("mutex-obtained", listener)
  return { removeEventListener("mutex-obtained", listener) }
}

/**
 * `mutex-released`: Occurs when the mutex has been released.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23mutex-released">Online Documentation</a>
 */
inline fun  ConcurrencyController.addMutexReleasedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("mutex-released", listener)
  return { removeEventListener("mutex-released", listener) }
}

/**
 * `active-changed`: Occurs the [active][ConcurrencyController] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23active-changed">Online Documentation</a>
 */
inline fun  ConcurrencyController.addActiveChangedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("active-changed", listener)
  return { removeEventListener("active-changed", listener) }
}

/**
 * `preferred-cursor-changed`: Occurs when the [preferredCursor][ConcurrencyController] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23preferred-cursor-changed">Online Documentation</a>
 */
inline fun  ConcurrencyController.addPreferredCursorChangedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("preferred-cursor-changed", listener)
  return { removeEventListener("preferred-cursor-changed", listener) }
}

/**
 * `priority-changed`: Occurs when [onPriorityChanged][ConcurrencyController] is called by the associated mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConcurrencyController%23priority-changed">Online Documentation</a>
 */
inline fun  ConcurrencyController.addPriorityChangedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("priority-changed", listener)
  return { removeEventListener("priority-changed", listener) }
}
