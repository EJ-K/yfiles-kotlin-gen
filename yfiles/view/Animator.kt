// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.core.Void
import js.promise.Promise
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan

/**
 * Runs [animations][IAnimation] in a [CanvasComponent].
 * @see [IAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [Animator] class for the given [CanvasComponent].
 * @param [canvasComponent] The canvas component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23Animator-constructor-Animator">Online Documentation</a>
 * 
 * @property canvasComponent
 * Gets the control the animations are run on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23canvasComponent">Online Documentation</a>
 */
open external class Animator (
final val canvasComponent: CanvasComponent)  {
  /**
   * Gets or sets whether user interaction should be allowed during the animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23allowUserInteraction">Online Documentation</a>
   */
  final var allowUserInteraction: Boolean
  
  /**
   * Gets or sets a value indicating whether to automatically [invalidate the control][Animator] this instance has been created for.
   * 
   * The default is true.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23autoInvalidation">Online Documentation</a>
   */
  final var autoInvalidation: Boolean
  
  /**
   * Gets or sets a value indicating whether the animator should pause or resume.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23paused">Online Documentation</a>
   */
  final var paused: Boolean
  
  /**
   * Animates the given animation.
   * @param [animation] The animation to perform.
   * @return A [Promise] that will resolve once the animation is finished.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23Animator-method-animate(IAnimation)">Online Documentation</a>
   */
  fun animate(
    animation: IAnimation,
  ): Promise<Void>
  
  /**
   * Starts animating the given animation for the specified duration.
   * @param [callback] The callback to use for the animation.
   * @param [duration] The duration that the animation should last.
   * @return A [Promise] that will resolve once the animation has finished.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23Animator-method-animate(AnimationCallback,TimeSpan)">Online Documentation</a>
   */
  fun animate(
    callback: AnimationCallback,
    duration: TimeSpan,
  ): Promise<Void>
  
  /**
   * Invalidates the control if [autoInvalidation][Animator] is set to `true`.
   * @param [canvasComponent] The component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23Animator-method-invalidateComponent">Online Documentation</a>
   */
  protected open fun invalidateComponent(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * Stops all running animations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Animator%23Animator-method-stop">Online Documentation</a>
   */
  open fun stop()
  
  companion object : ClassMetadata<Animator> {
  }
}
