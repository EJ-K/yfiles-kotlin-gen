// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Size
import yfiles.graph.ILabel
import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * Interface used by [ILabelStyle] implementations to query the actual [IVisualCreator], [IVisibilityTestable], [IBoundsProvider], [IHitTestable], and [IMarqueeTestable] implementations for a label and an associated style.
 * @see [ILabelStyle]
 * @see [ILabel]
 * @see [INodeStyleRenderer]
 * @see [IEdgeStyleRenderer]
 * @see [IPortStyleRenderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer">Online Documentation</a>
 */
external interface ILabelStyleRenderer : YObject {
/**
 * Gets an implementation of the [IBoundsProvider] interface that can handle the provided label and its associated style.
 * @param [label] The label to provide an instance for
 * @param [style] The style to use for the calculating the painting bounds
 * @return An implementation that may be used to subsequently query the label's painting bounds. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
   fun getBoundsProvider( label: ILabel ,
 style: ILabelStyle ):IBoundsProvider
/**
 * Gets a temporary context instance that can be used to query additional information for the label's style.
 * @param [label] The label to provide a context instance for.
 * @param [style] The style to use for the context.
 * @return An non-`null` lookup implementation.
 * @see [ILookup.EMPTY]
 * @see [ILookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getContext">Online Documentation</a>
 */
   fun getContext( label: ILabel ,
 style: ILabelStyle ):ILookup
/**
 * Gets an implementation of the [IHitTestable] interface that can handle the provided label and its associated style.
 * @param [label] The label to provide an instance for
 * @param [style] The style to use for the querying hit tests
 * @return An implementation that may be used to subsequently perform hit tests. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may return `null` to indicate that the label cannot be hit tested.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
   fun getHitTestable( label: ILabel ,
 style: ILabelStyle ):IHitTestable
/**
 * Gets an implementation of the [IMarqueeTestable] interface that can handle the provided label and its associated style.
 * @param [label] The label to provide an instance for
 * @param [style] The style to use for the querying marquee intersection test.
 * @return An implementation that may be used to subsequently query the marquee intersections. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
   fun getMarqueeTestable( label: ILabel ,
 style: ILabelStyle ):IMarqueeTestable
/**
 * Calculates the [preferred size][ILabel.preferredSize] of a given label using the associated style.
 * @param [label] The label to determine the preferred size for
 * @param [style] The style instance that uses this instance as its [ILabelStyle.renderer]
 * @return A size that can be used as the [ILabel.preferredSize] if this renderer renders the label using the associated style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getPreferredSize">Online Documentation</a>
 */
   fun getPreferredSize( label: ILabel ,
 style: ILabelStyle ):Size
/**
 * Gets an implementation of the [IVisibilityTestable] interface that can handle the provided label and its associated style.
 * @param [label] The label to provide an instance for
 * @param [style] The style to use for the testing the visibility
 * @return An implementation that may be used to subsequently query the label's visibility. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
   fun getVisibilityTestable( label: ILabel ,
 style: ILabelStyle ):IVisibilityTestable
/**
 * Gets an implementation of the [IVisualCreator] interface that can handle the provided label and its associated style.
 * @param [label] The label to provide an instance for
 * @param [style] The style to use for the creation of the visual
 * @return An implementation that may be used to subsequently create or update the visual for the label. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may not return `null` but should yield a [void][yfiles.view.VoidVisualCreator.INSTANCE] implementation instead.
 * @see [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelStyleRenderer%23ILabelStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
   fun getVisualCreator( label: ILabel ,
 style: ILabelStyle ):IVisualCreator

companion object : InterfaceMetadata<ILabelStyleRenderer> {
}
}
