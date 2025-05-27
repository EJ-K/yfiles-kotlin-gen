// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Matrix
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILabel
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.Visual

/**
 * An abstract base class that makes it possible to easily implement a custom [ILabelStyle].
 * @param [TVisual] The optional type of the [Visual] created and updated by the [createVisual][LabelStyleBase] and [updateVisual][LabelStyleBase] methods. This type argument can be omit, but specifying a more concrete type helps conveniently implementing [updateVisual][LabelStyleBase] with TypeScript.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelStyleBase] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-constructor-LabelStyleBase">Online Documentation</a>
 */
abstract external class LabelStyleBase<TVisual : Visual> protected constructor() : ILabelStyle {
  /**
   * Gets the renderer implementation for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23renderer">Online Documentation</a>
   */
  final override val renderer: ILabelStyleRenderer
  
  /**
   * Creates a new object that is a copy of the current instance.
   * @return A new object that is a copy of this instance using a memberwise clone.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-clone">Online Documentation</a>
   */
  override fun clone(): LabelStyleBase<TVisual>
  
  /**
   * Creates the visual.
   * @param [context] The render context.
   * @param [label] The label to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [updateVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-createVisual">Online Documentation</a>
   */
  protected abstract fun createVisual(
    context: IRenderContext,
    label: ILabel,
  ): TVisual?
  
  /**
   * Gets the bounds of the visual for the label in the given context.
   * @param [context] The canvas context.
   * @param [label] The label to which this style instance is assigned.
   * @return The visual bounds of the visual representation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-getBounds">Online Documentation</a>
   */
  protected open fun getBounds(
    context: ICanvasContext,
    label: ILabel,
  ): Rect
  
  /**
   * Returns the preferred [size][Size] of the label.
   * @param [label] The label to which this style instance is assigned.
   * @return The preferred size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-getPreferredSize">Online Documentation</a>
   */
  protected abstract fun getPreferredSize(
    label: ILabel,
  ): Size
  
  /**
   * Determines whether the visual representation of the label has been hit at the given location.
   * @param [context] The input mode context.
   * @param [location] The point to test.
   * @param [label] The label to which this style instance is assigned.
   * @return `true` if the specified label representation is hit; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-isHit">Online Documentation</a>
   */
  protected open fun isHit(
    context: IInputModeContext,
    location: Point,
    label: ILabel,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified label is included in the marquee selection.
   * @param [context] The input mode context.
   * @param [rectangle] The marquee selection box.
   * @param [label] The label to which this style instance is assigned.
   * @return `true` if the specified label is visible and selected by the marquee rectangle; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-isInBox">Online Documentation</a>
   */
  protected open fun isInBox(
    context: IInputModeContext,
    rectangle: Rect,
    label: ILabel,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified label is included in the lasso selection.
   * @param [context] The input mode context.
   * @param [path] The lasso selection path.
   * @param [label] The label to which this style instance is assigned.
   * @return `true` if the specified label is visible and selected by the lasso path; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-isInPath">Online Documentation</a>
   */
  protected open fun isInPath(
    context: IInputModeContext,
    path: GeneralPath,
    label: ILabel,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified label is visible in the context.
   * @param [context] The canvas context.
   * @param [rectangle] The clipping rectangle.
   * @param [label] The label to which this style instance is assigned.
   * @return `true` if the specified label is visible in the clipping rectangle; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-isVisible">Online Documentation</a>
   */
  protected open fun isVisible(
    context: ICanvasContext,
    rectangle: Rect,
    label: ILabel,
  ): Boolean
  
  /**
   * Performs the [lookup][yfiles.collections.ILookup] operation for the [getContext][ILabelStyleRenderer] that has been queried from the [renderer][LabelStyleBase].
   * @param [label] The label to use for the context lookup.
   * @param [type] The type to query.
   * @return An implementation of the `type` or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-lookup">Online Documentation</a>
   */
  protected open fun <T : Any> lookup(
    label: ILabel,
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Updates the visual previously created by [createVisual][LabelStyleBase].
   * @param [context] The render context.
   * @param [oldVisual] The visual that has been created in the call to [createVisual][LabelStyleBase].
   * @param [label] The label to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [createVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-updateVisual">Online Documentation</a>
   */
  protected open fun updateVisual(
    context: IRenderContext,
    oldVisual: TVisual,
    label: ILabel,
  ): TVisual?
  
  companion object : ClassMetadata<LabelStyleBase<*>> {
    /**
     * Creates a transform matrix that can be applied to a [Visual] to arrange it according to the given `layout` and `autoFlip` rule.
     * @param [layout] The layout used to create the transform matrix.
     * @param [autoFlip] Whether to automatically flip the matrix by 180 degrees, if the result would be pointing downwards.
     * @return The transform matrix (with projection).
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-createLayoutTransform(IOrientedRectangle,boolean)">Online Documentation</a>
     */
    @Deprecated("Read documentation for more information")
    fun createLayoutTransform(
      layout: IOrientedRectangle,
      autoFlip: Boolean,
    ): Matrix
    
    /**
     * Creates a transform matrix that can be applied to a [Visual] to arrange it according to the given `layout` and `autoFlip` rule.
     * @param [context] The render context.
     * @param [layout] The layout used to create the transform matrix.
     * @param [autoFlip] Whether to automatically flip the matrix by 180 degrees, if the result would be pointing downwards.
     * @return The transform matrix.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleBase%23LabelStyleBase-method-createLayoutTransform(IRenderContext,IOrientedRectangle,boolean)">Online Documentation</a>
     */
    fun createLayoutTransform(
      context: IRenderContext,
      layout: IOrientedRectangle,
      autoFlip: Boolean,
    ): Matrix
  }
}
