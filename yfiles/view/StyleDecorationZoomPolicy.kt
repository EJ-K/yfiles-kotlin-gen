// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Specifies how the zoom level affects the rendering of styles that are used as selection, highlight or focus indicator.
 * @see [NodeStyleDecorationInstaller]
 * @see [EdgeStyleDecorationInstaller]
 * @see [LabelStyleDecorationInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StyleDecorationZoomPolicy">Online Documentation</a>
 */
external sealed class StyleDecorationZoomPolicy: YEnum<StyleDecorationZoomPolicy> {
   companion object: EnumMetadata<StyleDecorationZoomPolicy> {
       /**
 * The visual is rendered in intermediate coordinates (the same as view coordinates if [CanvasComponent.projection] is not used) and doesn't scale with the zoom level.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StyleDecorationZoomPolicy%23VIEW_COORDINATES">Online Documentation</a>
 */
val VIEW_COORDINATES: StyleDecorationZoomPolicy

/**
 * The visual is rendered in the world coordinate system and thus scales with the zoom level like a regular graph item visualization, for example a node style.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StyleDecorationZoomPolicy%23WORLD_COORDINATES">Online Documentation</a>
 */
val WORLD_COORDINATES: StyleDecorationZoomPolicy

/**
 * Uses [WORLD_COORDINATES] rendering for zoom level ≥ 1 and [VIEW_COORDINATES] rendering for zoom level &lt; 1.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StyleDecorationZoomPolicy%23MIXED">Online Documentation</a>
 */
val MIXED: StyleDecorationZoomPolicy

/**
 * Uses [WORLD_COORDINATES] rendering for zoom level ≥ 1 and [VIEW_COORDINATES] rendering for zoom level &lt; 1, but in the latter case, the visual does not scale down below its initial size.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StyleDecorationZoomPolicy%23NO_DOWNSCALING">Online Documentation</a>
 */
val NO_DOWNSCALING: StyleDecorationZoomPolicy
   }
}
