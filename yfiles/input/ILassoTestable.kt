// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.GeneralPath
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is used to test whether a rendered item is deemed to be inside a lasso selection path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable">Online Documentation</a>
 */
external interface ILassoTestable  {
  /**
   * Returns `true` if the corresponding item is considered to intersect the given path.
   * @param [context] the current input mode context
   * @param [lassoPath] the path describing the lasso selection bounds
   * @return `true` if the item is considered to be captured by the lasso
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-method-isInPath">Online Documentation</a>
   */
  fun isInPath(
    context: IInputModeContext,
    lassoPath: GeneralPath,
  ): Boolean

  
  companion object : InterfaceMetadata<ILassoTestable> {
    /**
     * An implementation that always yields `true`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ALWAYS">Online Documentation</a>
     */
     val ALWAYS: ILassoTestable
    
    /**
     * An implementation that always yields `false`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23NEVER">Online Documentation</a>
     */
     val NEVER: ILassoTestable
    
    /**
     * Creates an implementation of the [ILassoTestable] interface that tests if the `orientedRectangle` intersects the area of the lasso path.
     * @param [orientedRectangle] The oriented rectangle to check.
     * @return An implementation of [ILassoTestable] for the oriented rectangle.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-defaultmethod-fromOrientedRectangle">Online Documentation</a>
     */
    fun fromOrientedRectangle(
      orientedRectangle: IOrientedRectangle,
    ): ILassoTestable
    
    /**
     * Creates an implementation of the [ILassoTestable] interface that tests if the `point` is [contained][GeneralPath] in the lasso path.
     * @param [point] The point to check.
     * @return An implementation of [ILassoTestable] for the point.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-defaultmethod-fromPoint">Online Documentation</a>
     */
    fun fromPoint(
      point: IPoint,
    ): ILassoTestable
    
    /**
     * Creates an implementation of the [ILassoTestable] interface that tests if the `rectangle` intersects the area of the lasso path.
     * @param [rectangle] The rectangle to check.
     * @return An implementation of [ILassoTestable] for the rectangle.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-defaultmethod-fromRectangle">Online Documentation</a>
     */
    @JsName("fromRectangle")
    operator fun invoke(
      rectangle: IRectangle,
    ): ILassoTestable
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      isInPath: (context: IInputModeContext, lassoPath: GeneralPath) -> Boolean
    ): ILassoTestable
  }
}
