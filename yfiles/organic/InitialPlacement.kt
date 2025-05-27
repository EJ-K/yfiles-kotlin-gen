// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants that specify the initial placement for the [ClassicOrganicLayout].
 * @see [ClassicOrganicLayout.initialPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InitialPlacement">Online Documentation</a>
 */
external sealed class InitialPlacement: YEnum<InitialPlacement> {
   companion object: EnumMetadata<InitialPlacement> {
       /**
 * Initial placement strategy for starting with randomly chosen node locations.
 * 
 * Value - `0`
 * @see [ClassicOrganicLayout.initialPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InitialPlacement%23RANDOM">Online Documentation</a>
 */
val RANDOM: InitialPlacement

/**
 * Initial placement strategy for starting with all node location coordinates set to `0`.
 * 
 * Value - `1`
 * @see [ClassicOrganicLayout.initialPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InitialPlacement%23ZERO">Online Documentation</a>
 */
val ZERO: InitialPlacement

/**
 * Initial placement strategy for starting with the node locations as they are in the input graph.
 * 
 * Value - `2`
 * @see [ClassicOrganicLayout.initialPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InitialPlacement%23AS_IS">Online Documentation</a>
 */
val AS_IS: InitialPlacement
   }
}
