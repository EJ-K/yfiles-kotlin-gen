// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable
import yfiles.view.IObjectRenderer

/**
 * This is the base class used by the implementers of [SnapContext] to model the result of the pointer being snapped to a certain location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult">Online Documentation</a>
 * 
 * @constructor Initializes the [tag][SnapResult], [weight][SnapResult] and [constraint][SnapResult] with the given values.
 * @param [constraint] The snap constraint describing valid pointer locations for this result.
 * @param [weight] The weight of this result.
 * @param [tag] The tag associated with this result.
 * @param [item] The item that is snapped by this result.
 * @param [itemAnchor] The anchor point of the `item` that is snapped by this result.
 * @param [reference] The reference this result is created for.
 * @param [renderer] The renderer to create the [Visual][yfiles.view.Visual] for this result. If omitted, a new default renderer will be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-constructor-SnapResult">Online Documentation</a>
 * 
 * @property constraint
 * Gets the snap constraint describing valid pointer locations for this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23constraint">Online Documentation</a>
 * 
 * @property weight
 * Gets or sets the weight of this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23weight">Online Documentation</a>
 * 
 * @property tag
 * Gets the tag associated with this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23tag">Online Documentation</a>
 * 
 * @property item
 * Gets the [IModelItem] instance that is snapped by this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23item">Online Documentation</a>
 * 
 * @property itemAnchor
 * Gets the anchor point of the [item][SnapResult] that is snapped by this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23itemAnchor">Online Documentation</a>
 * 
 * @property reference
 * Gets the [reference][SnapResult] instance that was used to create this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23reference">Online Documentation</a>
 */
open external class SnapResult (
final var constraint: SnapConstraint,
final var weight: Double,
final var tag: Tag? = definedExternally,
final var item: IModelItem? = definedExternally,
final var itemAnchor: Point? = definedExternally,
final var reference: SnapReference? = definedExternally,
renderer: IObjectRenderer<SnapResult>  = definedExternally) : IComparable<SnapResult> {
  /**
   * Gets or sets the [IObjectRenderer] instance that is used to create an [IVisualCreator][yfiles.view.IVisualCreator] and with it a [Visual][yfiles.view.Visual] for this result.
   * @see [IObjectRenderer.VOID_OBJECT_RENDERER]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23objectRenderer">Online Documentation</a>
   */
  final var objectRenderer: IObjectRenderer<SnapResult>
  
  /**
   * Implements the [IComparable] interface using [weight][SnapResult].
   * @param [other] The second [SnapResult]
   * @return The comparison value of the two SnapResults' Weights
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-method-compareTo">Online Documentation</a>
   */
  final override operator fun compareTo(
    other: SnapResult,
  ): Int
  
  companion object : ClassMetadata<SnapResult> {
    /**
     * Factory method that creates a [SnapResult] that snaps to a given circle.
     * @param [constraint] The snap constraint describing the valid pointer location for the created result.
     * @param [weight] The weight to assign to the result.
     * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight][SnapResult] will be rendered.
     * @param [item] The item that is snapped by this result.
     * @param [itemAnchor] The anchor point of the `item` that is snapped by this result.
     * @param [snapCircle] The circle reference used to create a visualization if no `renderer` is passed.
     * @param [renderer] The renderer to use. If omitted, a new default renderer will be created.
     * @return A [SnapResult] that snaps to the provided circle.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createCircleSnapResult">Online Documentation</a>
     */
    fun createCircleSnapResult(
      constraint: SnapConstraint,
      weight: Double,
      tag: Tag?,
      item: IModelItem?,
      itemAnchor: Point?,
      snapCircle: SnapCircle,
      renderer: IObjectRenderer<SnapResult>  = definedExternally,
    ): SnapResult
    
    /**
     * Factory method that creates a [SnapResult] which represents a [SnapLine] to which the current moved item will potentially snap.
     * @param [constraint] The snap constraint describing valid pointer locations for the created result.
     * @param [weight] The weight of this result. The higher the weight, the more important it is.
     * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight][SnapResult] will be rendered.
     * @param [item] The moved object for which this result is created.
     * @param [itemAnchor] The coordinates at the moved item at which the drawn snap line should end. A visual representation of a snap line is usually drawn from the [center][SnapLine] to these coordinates. This may, however, depend on the implementation.
     * @param [snapLine] The snap line this class would snap to or `null` if it doesn't snap to a `SnapLine`.
     * @param [renderer] The renderer to use. If omitted, a new default renderer will be created.
     * @return A [SnapResult] that represents the snap line this item will potentially snap to.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createLineSnapResult">Online Documentation</a>
     */
    fun createLineSnapResult(
      constraint: SnapConstraint,
      weight: Double,
      tag: Tag?,
      item: IModelItem?,
      itemAnchor: Point,
      snapLine: SnapLine?,
      renderer: IObjectRenderer<SnapResult>  = definedExternally,
    ): SnapResult
    
    /**
     * Factory method that creates a [SnapResult] which snaps to a given size through a resize operation.
     * @param [constraint] The snap constraint describing valid pointer locations for this result.
     * @param [weight] The weight of this result. The higher the weight, the more important it is.
     * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight][SnapResult] will be rendered.
     * @param [item] The item that is snapped by this result.
     * @param [snapSize] The [SnapSize] reference used to create this result.
     * @param [renderer] The renderer to use. If omitted, a new default renderer will be created.
     * @return A [SnapResult] that represents the snap to the given size through a resize operation.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createResizeSnapResult">Online Documentation</a>
     */
    fun createResizeSnapResult(
      constraint: SnapConstraint,
      weight: Double,
      tag: Tag?,
      item: IModelItem?  = definedExternally,
      snapSize: SnapSize?  = definedExternally,
      renderer: IObjectRenderer<SnapResult>  = definedExternally,
    ): SnapResult
    
    /**
     * Factory method that creates a [SnapResult] using the given `constraint`.
     * @param [constraint] The snap constraint describing the valid pointer location for the created result.
     * @param [weight] The weight to assign to the result.
     * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight][SnapResult] will be rendered.
     * @param [item] The item that is snapped by this result.
     * @param [itemAnchor] The anchor point of the `item` that is snapped by this result.
     * @param [reference] The reference the result shall be created for.
     * @param [renderer] The renderer to use. If omitted, a new default renderer will be created.
     * @return A result that uses the provided constraint.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createSnapResult">Online Documentation</a>
     */
    fun createSnapResult(
      constraint: SnapConstraint,
      weight: Double,
      tag: Tag?  = definedExternally,
      item: IModelItem?  = definedExternally,
      itemAnchor: Point?  = definedExternally,
      reference: SnapReference?  = definedExternally,
      renderer: IObjectRenderer<SnapResult>  = definedExternally,
    ): SnapResult
  }
}
