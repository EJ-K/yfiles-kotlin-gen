// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [FixGroupLayoutStage.interEdgeRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterEdgeRoutingStyle">Online Documentation</a>
 */
external sealed class InterEdgeRoutingStyle: YEnum<InterEdgeRoutingStyle> {
   companion object: EnumMetadata<InterEdgeRoutingStyle> {
       /**
 * An inter-edge routing style based on which the edge layout of inter-edges will be adopted from the [core layout algorithm][LayoutStageBase.coreLayout].
 * 
 * Value - `0`
 * @see [FixGroupLayoutStage.interEdgeRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterEdgeRoutingStyle%23ADOPT">Online Documentation</a>
 */
val ADOPT: InterEdgeRoutingStyle

/**
 * An inter-edge routing style based on which inter-edges are routed in an orthogonal style.
 * 
 * Value - `3`
 * @see [FixGroupLayoutStage.interEdgeRoutingStyle]
 * @see [FixGroupLayoutStage.interEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterEdgeRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: InterEdgeRoutingStyle

/**
 * An inter-edge routing style based on which inter-edges are routed as straight lines.
 * 
 * Value - `4`
 * @see [FixGroupLayoutStage.interEdgeRoutingStyle]
 * @see [FixGroupLayoutStage.interEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterEdgeRoutingStyle%23STRAIGHTLINE">Online Documentation</a>
 */
val STRAIGHTLINE: InterEdgeRoutingStyle
   }
}
